package co.com.sofka.crud.dto;

public class TodoDTO {
    private Long id;
    private String name;
    private boolean completed;
    private Long identificator;



    //metodos set y get


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
