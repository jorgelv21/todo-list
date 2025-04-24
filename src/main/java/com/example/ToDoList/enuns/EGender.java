package com.example.ToDoList.enuns;


public enum EGender  {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    public final String description;

    EGender(String value) {
        description = value;
    }
}
