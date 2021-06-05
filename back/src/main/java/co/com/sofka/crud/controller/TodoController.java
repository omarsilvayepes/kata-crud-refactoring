package co.com.sofka.crud.controller;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.Todo;
import co.com.sofka.crud.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<TodoDTO> list(){
        return service.list();
    }
    
    @PostMapping(value = "api/save")
    public TodoDTO save(@RequestBody TodoDTO todoDto){
        return service.save(todoDto);
    }

    @PutMapping(value = "api/update")
    public TodoDTO update(@RequestBody TodoDTO todoDto){
        if(todoDto.getId() != null){
            return service.save(todoDto);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/delete")
    public void delete(@PathVariable("id")Long id){

        service.delete(id);
    }

    @GetMapping(value = "api/{id}/todo")
    public TodoDTO get(@PathVariable("id") Long id){
        return service.get(id);
    }


}
