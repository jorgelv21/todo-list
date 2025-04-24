package com.example.ToDoList.repositories;

import com.example.ToDoList.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long>{
}
