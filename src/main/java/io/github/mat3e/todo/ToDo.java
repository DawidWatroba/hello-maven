package io.github.mat3e.todo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
    class ToDo {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    private String text;
    private Boolean done;

    /**
     * Hibernate (JPA) needs it :)
     */
    @SuppressWarnings("unused")
    ToDo(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String taskToDo) {
        this.text = taskToDo;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public ToDo(Integer id, String taskToDo, Boolean done) {
        this.id = id;
        this.text = taskToDo;
        this.done = done;
    }
}
