package com.example.ToDoList.controllers;

import com.example.ToDoList.model.Todo;
import com.example.ToDoList.repositories.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * To do List Controller
 */
@RestController
@RequestMapping("todo")
public class TodoController extends GenericController<Todo, Long> {
    /**
     * Generic Service Constructor
     *
     * @param genericRepository - Generic Repository
     */
    protected TodoController(GenericRepository<Todo, Long> genericRepository) {
        super(genericRepository);
    }
}
