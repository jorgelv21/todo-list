package com.example.ToDoList.services;

import com.example.ToDoList.model.DataUser;
import com.example.ToDoList.repositories.GenericRepository;

/**
 * Data of user Service
 */
public class DataUserService extends GenericService<DataUser, Long> {
    /**
     * Generic Service Constructor
     *
     * @param genericRepository - Generic Repository
     */
    protected DataUserService(GenericRepository<DataUser, Long> genericRepository) {
        super(genericRepository);
    }
}
