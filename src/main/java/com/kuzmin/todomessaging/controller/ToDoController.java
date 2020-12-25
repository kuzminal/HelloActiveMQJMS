package com.kuzmin.todomessaging.controller;

import com.kuzmin.todomessaging.domain.ToDo;
import com.kuzmin.todomessaging.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    ToDoService toDoService;

    @GetMapping("/todo")
    private List<ToDo> getAll() {
        return toDoService.getAll();
    }
}
