package com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.ds.gateway.impl;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDsGateway {
    Optional<Employee> fetchEmployeeById(String employeeId);

    List<Employee> fetchAllEmployees();

    boolean employeeExistsByEmail(String email);

    void saveEmployee(Employee employee);
}
