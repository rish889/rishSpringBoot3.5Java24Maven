package com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.impl;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.ds.gateway.impl.EmployeeDsGateway;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDsGateway employeeDsGateway;

    @Override
    public Optional<Employee> fetchEmployeeById(String employeeId) {
        return employeeDsGateway.fetchEmployeeById(employeeId);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDsGateway.saveEmployee(employee);
    }
}
