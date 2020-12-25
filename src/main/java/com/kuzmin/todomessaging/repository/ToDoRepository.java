package com.kuzmin.todomessaging.repository;

import com.kuzmin.todomessaging.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo,String> {
}
