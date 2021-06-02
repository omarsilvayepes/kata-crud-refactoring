package co.com.sofka.crud;
import java.util.List;
public interface InterfaceTodo {
    //interfaz DTO para ayudar a mover los datos entre los componentes

    //definir los metodos
    public Iterable<Todo> list();
    public Todo save(Todo todo);
    public void delete(Long id);
    public Todo get(Long id);

}
