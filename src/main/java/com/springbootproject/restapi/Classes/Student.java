package com.springbootproject.restapi.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity // This marks that the Student class represents a JPA Entity, represents a table in the database
@Table(name="student")//Actual name of the table
public class Student {
    @Id//Marks the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Primary key will be automatically generated in the table
    private long id;
    private String name;
    private String email;
    private String address;
}
