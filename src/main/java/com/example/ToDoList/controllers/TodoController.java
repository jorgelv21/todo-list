package com.example.ToDoList.controllers;

import com.example.ToDoList.model.Todo;
import com.example.ToDoList.repositories.GenericRepository;


/**
 * To do List Controller
 */
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
