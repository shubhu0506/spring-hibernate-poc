package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department) {
        if (department.getEmployees() != null) {
            for (var employee : department.getEmployees()) {
                employee.setDepartment(department);
            }
        }
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public void deleteDepartment(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        if (department.isPresent()) {
            if (department.get().getEmployees() != null) {
                for (Employee employee : department.get().getEmployees()) {
                    employeeRepository.deleteById(employee.getId());
                }
            }

        }
        departmentRepository.deleteById(id);
    }
}