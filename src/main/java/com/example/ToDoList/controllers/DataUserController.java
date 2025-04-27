package com.example.ToDoList.controllers;

import com.example.ToDoList.model.DataUser;
import com.example.ToDoList.repositories.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Data user controller.
 */
@RestController
@RequestMapping("data_user")
public class DataUserController extends GenericController<DataUser, Long> {
    /**
     * Generic Service Constructor
     *
     * @param genericRepository - Generic Repository
     */
    protected DataUserController(GenericRepository<DataUser, Long> genericRepository) {
        super(genericRepository);
    }
}
