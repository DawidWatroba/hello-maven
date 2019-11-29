package io.github.mat3e.todo;

import io.github.mat3e.HibernateUtil;
import io.github.mat3e.lang.Lang;

import java.util.List;

public class ToDoRepository {
    List<ToDo> findAll(){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.createQuery("from ToDo", ToDo.class).list();
        transaction.commit();
        session.close();
        return result;
    }
}
