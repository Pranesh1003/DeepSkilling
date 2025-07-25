package com.example.ems.controller;

import com.example.ems.entity.Employee;
import com.example.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/by-department/{name}")
    public List<Employee> getByDepartment(@PathVariable String name) {
        return employeeRepository.findByDepartmentName(name);
    }

    @GetMapping("/search")
    public List<Employee> searchByName(@RequestParam String name) {
        return employeeRepository.searchByNameLike(name);
    }

    @GetMapping("/by-email")
    public Employee getByEmail(@RequestParam String email) {
        return employeeRepository.findByEmail(email);
    }
}
