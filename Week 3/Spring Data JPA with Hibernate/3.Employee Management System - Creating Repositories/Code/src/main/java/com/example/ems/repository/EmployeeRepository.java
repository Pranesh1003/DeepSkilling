package com.example.ems.repository;

import com.example.ems.entity.Employee;
import com.example.ems.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(Department department);
    List<Employee> findByNameContainingIgnoreCase(String name);
    Employee findByEmail(String email);
}
