package com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.mapper;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeRequestDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeResponseDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

import java.util.UUID;

public class EmployeeDtoMapper {
    public static Employee convertToModel(final EmployeeRequestDto dto) {
        final Employee employee = Employee.builder()
                .employeeId(UUID.randomUUID().toString())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .build();
        return employee;
    }

    public static EmployeeResponseDto convertToResponseDto(final Employee model) {
        final EmployeeResponseDto dto = EmployeeResponseDto.builder()
                .employeeId(model.getEmployeeId())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .email(model.getEmail())
                .build();
        return dto;
    }
}
