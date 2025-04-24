package com.example.ToDoList.model;

import com.example.ToDoList.enuns.EGender;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name="data_user")
public class DataUser extends GenericClass {


    @JsonIdentityReference
    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Column(name= "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "age")
    private Number age;

    @Column(name = "gender")
    private EGender gender;
}
