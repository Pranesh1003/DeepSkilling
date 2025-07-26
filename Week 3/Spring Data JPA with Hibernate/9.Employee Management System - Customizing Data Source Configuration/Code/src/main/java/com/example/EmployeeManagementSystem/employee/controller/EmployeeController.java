package com.example.EmployeeManagementSystem.employee.controller;

import com.example.EmployeeManagementSystem.employee.entity.Employee;
import com.example.EmployeeManagementSystem.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }
}
