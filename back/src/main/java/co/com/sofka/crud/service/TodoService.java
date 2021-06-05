package co.com.sofka.crud.service;

import co.com.sofka.crud.DAO.IntTodoService;
import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.Todo;
import co.com.sofka.crud.mapper.TodoMapper;
import co.com.sofka.crud.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements IntTodoService {

    @Autowired
    private TodoRepository repository;

    @Autowired
    private TodoMapper mapper;


    @Override
    public Iterable<TodoDTO> list() {
        Iterable<Todo> todos = repository.findAll();
        return mapper.toTodoDto(todos);
    }

    @Override
    public TodoDTO save(TodoDTO todoDto) {
        Todo todo = mapper.toTodo(todoDto);
        return mapper.toTodoDto(repository.save(todo));

    }

    @Override
    public void delete(Long id) {
        repository.delete(mapper.toTodo(get(id)));
    }

    @Override
    public TodoDTO get(Long id) {
        Todo todo = repository.findById(id).orElseThrow();
        return mapper.toTodoDto(todo);
    }
}
