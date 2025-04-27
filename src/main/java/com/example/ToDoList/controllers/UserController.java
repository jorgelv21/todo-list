package com.example.ToDoList.controllers;

import com.example.ToDoList.model.User;
import com.example.ToDoList.repositories.GenericRepository;

/**
 * User Controller
 */
public class UserController extends GenericController<User, Long> {
    /**
     * Generic Service Constructor
     *
     * @param genericRepository - Generic Repository
     */
    protected UserController(GenericRepository<User, Long> genericRepository) {
        super(genericRepository);
    }


}
