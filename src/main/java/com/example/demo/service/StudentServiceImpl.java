package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Integer id, Student student) {
        if (!studentRepository.findById(id).isEmpty()) {
            Student student1 = new Student();
            student1.setStudentName(student.getStudentName());
            student1.setDepartment(student.getDepartment());
            student1.setAddress(student.getAddress());
            return studentRepository.save(student);
        }
        throw new RuntimeException("Student Not Present");
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student getById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
