package com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto;

public class EmployeeDto {
    private String id;
    private String name;

    public EmployeeDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}


