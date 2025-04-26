package com.example.ToDoList.services;

import com.example.ToDoList.model.User;
import com.example.ToDoList.repositories.GenericRepository;
import com.example.ToDoList.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User, Long> {

    /**
     * Generic Service Constructor
     *
     * @param genericRepository - Generic Repository
     */
    public UserService(GenericRepository<User, Long> genericRepository, UserRepository userRepositor) {
        super(genericRepository);
    }

}
