package com.example.ems.repository;

import com.example.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query method
    List<Employee> findByDepartmentName(String departmentName);

    // Custom query using @Query
    @Query("SELECT e FROM Employee e WHERE e.name LIKE %?1%")
    List<Employee> searchByNameLike(String name);

    // Named query (defined in entity)
    Employee findByEmail(String email);
}
