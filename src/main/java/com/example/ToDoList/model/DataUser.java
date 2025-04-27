package com.example.ToDoList.model;

import com.example.ToDoList.enuns.EGender;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcType;
import org.hibernate.dialect.PostgreSQLEnumJdbcType;


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
    @JoinColumn(name = "user_id", unique = true, nullable = false)
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
    private int age;

    /**
     * Gender of user.
     */
    @Column(name = "gender", columnDefinition = "EGender")
    @Enumerated
    @JdbcType(PostgreSQLEnumJdbcType.class)
    private EGender gender;
}
