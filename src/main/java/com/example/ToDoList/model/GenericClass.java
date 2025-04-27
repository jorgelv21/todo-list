package com.example.ToDoList.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.*;
import org.springframework.data.annotation.Persistent;
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
     * Identification of Object
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
    @Column(name = "register_date", updatable = false)
    @TimeZoneStorage(value = TimeZoneStorageType.AUTO)
    @DateTimeFormat(pattern = "DD/MM/YYYY")
    @Persistent
    @CurrentTimestamp
    private Date registerDate;

    /**
     * Time of update data
     */
    @Column(name = "update_date", insertable = false)
    @TimeZoneStorage(value = TimeZoneStorageType.AUTO)
    @DateTimeFormat(pattern = "DD/MM/YYYY")
    @UpdateTimestamp
    private Date updateDate;

}
