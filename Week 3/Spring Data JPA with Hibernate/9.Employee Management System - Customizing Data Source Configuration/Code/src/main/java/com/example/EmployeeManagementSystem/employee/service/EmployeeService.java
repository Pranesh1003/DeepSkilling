package com.example.EmployeeManagementSystem.employee.service;

import com.example.EmployeeManagementSystem.employee.entity.Employee;
import com.example.EmployeeManagementSystem.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
