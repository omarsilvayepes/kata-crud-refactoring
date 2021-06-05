package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {
}
