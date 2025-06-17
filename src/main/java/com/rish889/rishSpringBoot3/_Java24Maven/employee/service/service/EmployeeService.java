package com.rish889.rishSpringBoot3._Java24Maven.employee.service.service;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

public interface EmployeeService {
    Employee fetchEmployeeById(String employeeId);

    void saveEmployee(Employee employee);
}
