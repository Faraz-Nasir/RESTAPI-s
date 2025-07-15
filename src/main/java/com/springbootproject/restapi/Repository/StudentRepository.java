package com.springbootproject.restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootproject.restapi.Classes.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
