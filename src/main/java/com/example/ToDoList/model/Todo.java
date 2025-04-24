package com.example.ToDoList.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Class of todo list
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "todo")
public class Todo extends GenericClass{

    /**
     * Description of todo
     */
    @Column(name = "description")
    private String description;


    /**
     * User who created this todo
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User userId;

}
