package com.example.EmployeeManagementSystem.department.controller;

import com.example.EmployeeManagementSystem.department.entity.Department;
import com.example.EmployeeManagementSystem.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }
}
