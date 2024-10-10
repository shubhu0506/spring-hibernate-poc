package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    Student updateStudent(Integer studentId,Student student);

    void deleteStudent(int studentId);


    Student getById(int id);

    List<Student> getAll();
}
