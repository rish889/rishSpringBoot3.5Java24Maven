package com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.mapper;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.EmployeeEntity;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

public class EmployeeEntityMapper {
    public static EmployeeEntity convertToEntity(Employee model) {
        EmployeeEntity entity = EmployeeEntity.builder()
                .employeeId(model.getEmployeeId())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .email(model.getEmail())
                .build();
        return entity;
    }

    public static Employee convertToModel(EmployeeEntity entity) {
        Employee model = Employee.builder()
                .employeeId(entity.getEmployeeId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .build();
        return model;
    }
}
