package com.example.ToDoList.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "user")
public class User extends GenericClass{

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "userId")
    @JsonManagedReference
    private DataUser dataUser;

}
