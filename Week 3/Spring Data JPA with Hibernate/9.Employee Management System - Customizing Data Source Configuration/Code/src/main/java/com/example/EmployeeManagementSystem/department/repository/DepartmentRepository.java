package com.example.EmployeeManagementSystem.department.repository;

import com.example.EmployeeManagementSystem.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
