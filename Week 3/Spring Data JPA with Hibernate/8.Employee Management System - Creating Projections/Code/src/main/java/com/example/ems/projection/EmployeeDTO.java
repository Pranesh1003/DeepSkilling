package com.example.ems.projection;

public class EmployeeDTO {

    private String name;
    private String departmentName;

    public EmployeeDTO(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
