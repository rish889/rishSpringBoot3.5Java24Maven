package com.rish889.rishSpringBoot3._Java24Maven.employee.service.service;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> fetchEmployeeById(String employeeId);

    void saveEmployee(Employee employee);
}
