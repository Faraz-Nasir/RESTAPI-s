package com.springbootproject.restapi.Service;

import java.util.List;

import com.springbootproject.restapi.Classes.Student;

public interface StudentService {
    public Student createStudent(Student student);
    public List<Student> getAllStudents();
    public Student updateStudent(long id,Student student);
    public void deleteStudent(long id);
    
}
