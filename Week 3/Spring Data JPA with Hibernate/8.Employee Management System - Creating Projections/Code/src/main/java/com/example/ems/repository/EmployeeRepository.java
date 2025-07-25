package com.example.ems.repository;

import com.example.ems.entity.Employee;
import com.example.ems.projection.EmployeeNameEmailProjection;
import com.example.ems.projection.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Interface-based projection
    List<EmployeeNameEmailProjection> findBy();

    // Class-based projection using constructor expression
    @Query("SELECT new com.example.ems.projection.EmployeeDTO(e.name, e.department.name) FROM Employee e")
    List<EmployeeDTO> fetchEmployeeDTO();
}
