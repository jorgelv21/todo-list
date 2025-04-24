package com.example.ToDoList.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

/**
 * Class of user.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "user")
public class User extends GenericClass{

    /**
     * Name of user.
     */
    @Column(name = "name")
    private String name;

    /**
     * Data of user.
     */
    @OneToOne(mappedBy = "userId")
    @JsonManagedReference
    private DataUser dataUser;

}
