package com.example.ToDoList.repositories;

import com.example.ToDoList.model.DataUser;
import org.springframework.stereotype.Repository;

/**
 * Repository of user data.
 */
@Repository
public interface DataUserRepository extends GenericRepository<DataUser, Long>{
}
