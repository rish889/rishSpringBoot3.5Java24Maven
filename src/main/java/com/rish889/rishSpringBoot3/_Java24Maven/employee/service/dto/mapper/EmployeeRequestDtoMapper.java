package com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.mapper;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeRequestDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

import java.util.UUID;

public class EmployeeRequestDtoMapper {
    public static Employee convertToModel(final EmployeeRequestDto dto) {
        final Employee employee = Employee.builder()
                .employeeId(UUID.randomUUID().toString())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build();
        return employee;
    }
}
