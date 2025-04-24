package com.example.ToDoList.exceptions;

/**
 * Exception for not found Item.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
