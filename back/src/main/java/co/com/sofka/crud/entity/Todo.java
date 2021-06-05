package co.com.sofka.crud.entity;

import javax.persistence.*;


@Entity
@Table(name="TO_DO")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private boolean completed;
    private Long identificator;


    //Getter y Setter de los atributos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getIdentificator() {
        return identificator;
    }

    public void setIdentificator(Long identificator) {
        this.identificator = identificator;
    }
}
