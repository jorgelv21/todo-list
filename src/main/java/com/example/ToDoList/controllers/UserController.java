package com.example.ToDoList.controllers;

import com.example.ToDoList.model.User;
import com.example.ToDoList.repositories.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User Controller
 */
@RestController
@RequestMapping("user")
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
