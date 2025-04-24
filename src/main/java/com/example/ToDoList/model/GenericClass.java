package com.example.ToDoList.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.TimeZoneStorage;
import org.hibernate.annotations.TimeZoneStorageType;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Class Generic for use in all classes
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
public class GenericClass {


    /**
     * Id of Object
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    /**
     * Flag of deleted
     */
    @Column(name = "deleted")
    private boolean deleted;

    /**
     * Time of register data
     */
    @Column(name = "register_date")
    @CreationTimestamp
    @TimeZoneStorage(value = TimeZoneStorageType.AUTO)
    @DateTimeFormat(pattern = "DD/MM/YYYY")
    private Date registerDate;

    /**
     * Time of update data
     */
    @Column(name = "update_date")
    @TimeZoneStorage(value = TimeZoneStorageType.AUTO)
    @DateTimeFormat(pattern = "DD/MM/YYYY")
    @UpdateTimestamp
    private Date updateDate;


}
