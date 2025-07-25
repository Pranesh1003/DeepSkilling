package com.example.ems.controller;

import com.example.ems.projection.EmployeeDTO;
import com.example.ems.projection.EmployeeNameEmailProjection;
import com.example.ems.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/projection/interface")
    public List<EmployeeNameEmailProjection> getInterfaceProjections() {
        return employeeService.getAllEmployeeNamesAndEmails();
    }

    @GetMapping("/projection/class")
    public List<EmployeeDTO> getClassProjections() {
        return employeeService.getEmployeeDTOs();
    }
}
