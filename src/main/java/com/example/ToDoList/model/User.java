package com.example.ToDoList.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.jetbrains.annotations.NotNull;

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
    @NotNull
    private String name;

    /**
     * Data of user.
     */
    @OneToOne(mappedBy = "userId")
    @JsonManagedReference
    private DataUser dataUser;

    @Column(name = "username", unique = true)
    @NotNull
    private String username;

    @Column(name = "password")
    @NotNull
    private String password;

}
