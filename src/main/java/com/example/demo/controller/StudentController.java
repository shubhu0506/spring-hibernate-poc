package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(value = "/students",
            produces = {"application/json"})
    ResponseEntity<List<Student>> getAllStudent() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping(value = "/student/{studentId}",
            produces = {"application/json"})
    ResponseEntity<Student> getStudentById(@PathVariable Integer studentId) {
        return ResponseEntity.ok().body(service.getById(studentId));
    }

    @DeleteMapping(value = "/students/{studentId}",
            produces = {"application/json"})
    ResponseEntity<Void> deleteStudentById(@PathVariable Integer studentId) {
        service.deleteStudent(studentId);
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/student",
            produces = {"application/json"})
    ResponseEntity<Student> postStudent(@RequestBody Student student) {
        return ResponseEntity.ok().body(service.addStudent(student));
    }

    @PutMapping(value = "/student/{studentId}",
            produces = {"application/json"})
    ResponseEntity<Student> updateStudent(@PathVariable Integer studentId, @RequestBody Student student) {
        return ResponseEntity.ok().body(service.updateStudent(studentId, student));
    }
}
