package com.rish889.rishSpringBoot3._Java24Maven.employee.service.service;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> fetchAllEmployees();

    Employee fetchEmployeeById(String employeeId);

    void saveEmployee(Employee employee);
}
