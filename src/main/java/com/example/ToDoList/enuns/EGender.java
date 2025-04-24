package com.example.ToDoList.enuns;


/**
 * Enum for Gender
 */
public enum EGender  {

    /**
     * Values of enum with description
     */
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    /**
     * Description of enum
     */
    public final String description;

    /**
     * Convert Enum to value.
     * @param value
     */
    EGender(String value) {
        description = value;
    }
}
