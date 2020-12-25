package com.kuzmin.todomessaging.repository;

import com.kuzmin.todomessaging.domain.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo,String> {
    @Query("select t from ToDo t")
    List<ToDo> getAll();
}
