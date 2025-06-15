package com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.ds.gateway;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;

public interface EmployeeDsGateway {
    Employee fetchEmployeeById(String employeeId);

    void saveEmployee(Employee employee);
}
