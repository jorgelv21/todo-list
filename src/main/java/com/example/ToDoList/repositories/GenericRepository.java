package com.example.ToDoList.repositories;

import com.example.ToDoList.model.GenericClass;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@MappedSuperclass
@EnableJpaRepositories
@Repository
public interface GenericRepository<T extends GenericClass, L extends Number>  extends JpaRepository<T, L> {
}
