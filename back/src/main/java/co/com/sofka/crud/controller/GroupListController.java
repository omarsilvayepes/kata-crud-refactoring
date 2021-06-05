package co.com.sofka.crud.controller;

import co.com.sofka.crud.entity.GroupList;
import co.com.sofka.crud.service.GroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class GroupListController {
    @Autowired
    private GroupListService service;

    @GetMapping(value = "api/grouplists")
    public Iterable<GroupList> list(){
        return service.list();
    }
    @PostMapping(value = "api/grouplist")
    public GroupList save(@RequestBody GroupList groupList) {
        return service.save(groupList);
    }

    @PutMapping(value = "api/grouplist")
    public GroupList update(@RequestBody GroupList groupList){
        if (groupList.getId()!= null){
            return service.save(groupList);
        }throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}/grouplist")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/grouplist")
    public GroupList get(@PathVariable("id")Long id){
        return  service.get(id);
    }

}
