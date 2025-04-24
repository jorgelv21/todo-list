package com.example.ToDoList.repositories;

import com.example.ToDoList.model.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends GenericRepository<Todo, Long>{
}
