package com.example.ToDoList.repositories;

import com.example.ToDoList.model.User;
import org.springframework.stereotype.Repository;

/**
 * Repository of user.
 */
@Repository
public interface UserRepository extends GenericRepository<User, Long>{
}
