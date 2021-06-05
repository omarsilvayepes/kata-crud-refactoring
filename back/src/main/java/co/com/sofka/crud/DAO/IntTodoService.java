package co.com.sofka.crud.DAO;


import co.com.sofka.crud.dto.TodoDTO;

public interface IntTodoService {
    Iterable<TodoDTO> list();
    TodoDTO save(TodoDTO todoDto);
    void delete(Long id);
    TodoDTO get(Long id);

}
