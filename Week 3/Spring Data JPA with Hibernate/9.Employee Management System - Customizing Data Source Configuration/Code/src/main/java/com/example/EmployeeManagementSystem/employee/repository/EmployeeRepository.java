package com.example.EmployeeManagementSystem.employee.repository;

import com.example.EmployeeManagementSystem.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
