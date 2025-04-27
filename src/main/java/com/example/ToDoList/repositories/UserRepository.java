package com.example.ToDoList.repositories;

import com.example.ToDoList.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository of user.
 */
@Repository
public interface UserRepository extends GenericRepository<User, Long>{
    Optional<User> findByUsername(String username);
}
