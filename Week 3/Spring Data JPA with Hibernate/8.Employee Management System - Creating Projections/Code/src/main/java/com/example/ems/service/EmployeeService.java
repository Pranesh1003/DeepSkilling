package com.example.ems.service;

import com.example.ems.projection.EmployeeDTO;
import com.example.ems.projection.EmployeeNameEmailProjection;
import com.example.ems.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeNameEmailProjection> getAllEmployeeNamesAndEmails() {
        return employeeRepository.findBy();
    }

    public List<EmployeeDTO> getEmployeeDTOs() {
        return employeeRepository.fetchEmployeeDTO();
    }
}
