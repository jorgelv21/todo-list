package com.example.ToDoList.services;

import com.example.ToDoList.model.Todo;
import com.example.ToDoList.repositories.GenericRepository;

public class TodoService extends GenericService<Todo, Long> {
    /**
     * Generic Service Constructor
     *
     * @param genericRepository - Generic Repository
     */
    protected TodoService(GenericRepository<Todo, Long> genericRepository) {
        super(genericRepository);
    }
}
