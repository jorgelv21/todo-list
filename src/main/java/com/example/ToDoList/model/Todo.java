package com.example.ToDoList.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Class of to do list
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "todo")
public class Todo extends GenericClass{

    /**
     * Description of to do
     */
    @Column(name = "description")
    private String description;


    /**
     * User who created this to do
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User userId;

}
