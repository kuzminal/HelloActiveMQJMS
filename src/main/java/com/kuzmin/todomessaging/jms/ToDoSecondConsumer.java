package com.kuzmin.todomessaging.jms;

import com.kuzmin.todomessaging.domain.ToDo;
import com.kuzmin.todomessaging.repository.ToDoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class ToDoSecondConsumer {
    private Logger log = LoggerFactory.getLogger(ToDoConsumer.class);
    private ToDoRepository repository;

    public ToDoSecondConsumer(ToDoRepository repository) {
        this.repository = repository;
    }

    @JmsListener(destination = "${todo.jms.destination}", containerFactory =
            "jmsFactory")
    public void processToDo(@Valid ToDo todo) {
        log.info("Second Consumer received message> " + todo);
    }
}
