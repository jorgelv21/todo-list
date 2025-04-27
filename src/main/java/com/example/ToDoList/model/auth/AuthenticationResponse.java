package com.example.ToDoList.model.auth;

import lombok.*;

@Getter
@Setter
@ToString
public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
}
