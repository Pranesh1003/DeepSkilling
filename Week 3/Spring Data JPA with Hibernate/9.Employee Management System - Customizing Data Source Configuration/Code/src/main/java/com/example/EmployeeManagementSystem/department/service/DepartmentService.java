package com.example.EmployeeManagementSystem.department.service;

import com.example.EmployeeManagementSystem.department.entity.Department;
import com.example.EmployeeManagementSystem.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }
}
