package com.rish889.rishSpringBoot3._Java24Maven.employee.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
}