package com.kuzmin.todomessaging.service;

import com.kuzmin.todomessaging.domain.ToDo;
import com.kuzmin.todomessaging.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ToDoService {
    @Autowired
    ToDoRepository toDoRepository;

    public List<ToDo> getAll() {
        return toDoRepository.getAll();
    }
}
