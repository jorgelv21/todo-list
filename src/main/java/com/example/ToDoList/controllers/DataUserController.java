package com.example.ToDoList.controllers;

import com.example.ToDoList.model.DataUser;
import com.example.ToDoList.repositories.GenericRepository;


/**
 * Data user controller.
 */
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
