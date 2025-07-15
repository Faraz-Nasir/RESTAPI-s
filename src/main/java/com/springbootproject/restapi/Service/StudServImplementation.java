package com.springbootproject.restapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.restapi.Classes.Student;
import com.springbootproject.restapi.Repository.StudentRepository;

@Service
public class StudServImplementation implements StudentService{
    @Autowired StudentRepository studentRepository;
    
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student updateStudent(long id,Student student){
        student.setId(id);
        return studentRepository.save(student);
    }
    public void deleteStudent(long id){
        studentRepository.deleteById(id);
    }
}
