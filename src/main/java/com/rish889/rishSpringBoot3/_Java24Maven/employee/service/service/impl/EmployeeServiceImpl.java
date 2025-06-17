package com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.impl;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.ds.gateway.impl.EmployeeDsGateway;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.EmployeeService;
import com.rish889.rishSpringBoot3._Java24Maven.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDsGateway employeeDsGateway;

    @Override
    public List<Employee> fetchAllEmployees() {
        return employeeDsGateway.fetchAllEmployees();
    }

    @Override
    public Employee fetchEmployeeById(String employeeId) {
        Optional<Employee> employeeOptional = employeeDsGateway.fetchEmployeeById(employeeId);
        if (employeeOptional.isEmpty()) {
            throw new BadRequestException("employee_not_found", "Employee not found for employeeId : " + employeeId);
        }
        return employeeOptional.get();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        if (employeeDsGateway.employeeExistsByEmail(employee.getEmail())) {
            throw new BadRequestException("email_already_registered", "Email already registered : " + employee.getEmail());
        }
        employeeDsGateway.saveEmployee(employee);
    }
}
