package com.example.ToDoList.model;

import com.example.ToDoList.enuns.EGender;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

/**
 * Class with data of user
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name="data_user")
public class DataUser extends GenericClass {


    /**
     * Id of user.
     */
    @JsonIdentityReference
    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    /**
     * Email of user.
     */
    @Column(name= "email")
    private String email;

    /**
     * Phone of user.
     */
    @Column(name = "phone")
    private String phone;

    /**
     * Age of user.
     */
    @Column(name = "age")
    private Number age;

    /**
     * Gender of user.
     */
    @Column(name = "gender")
    private EGender gender;
}
