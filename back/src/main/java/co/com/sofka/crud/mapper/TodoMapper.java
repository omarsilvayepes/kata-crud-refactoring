package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.Todo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")

public interface TodoMapper {

    @Mappings({

            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "completed",target = "completed"),
            @Mapping(source = "identificator",target = "identificator")
    })

    // CONVERSION de ENTIDAD A DTO
    TodoDTO toTodoDto(Todo todo);
    Iterable<TodoDTO> toTodoDto (Iterable<Todo> todos);

    //  CONVERSION DE DTO A ENTIDAD

    @InheritInverseConfiguration
    Todo toTodo(TodoDTO todoDto);

}
