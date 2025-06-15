package com.rish889.rishSpringBoot3._Java24Maven.employee.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Employee {
    private String employeeId;
    private String firstName;
}