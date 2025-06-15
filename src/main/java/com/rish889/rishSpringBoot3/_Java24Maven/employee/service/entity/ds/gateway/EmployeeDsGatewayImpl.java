package com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.ds.gateway;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.EmployeeEntity;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.repository.EmployeeRepository;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.ds.gateway.EmployeeDsGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeDsGatewayImpl implements EmployeeDsGateway {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> fetchEmployeeById(String employeeId) {
        Optional<EmployeeEntity> employeeEntityOptional = employeeRepository.findById(employeeId);
        return employeeEntityOptional.map(employeeEntity -> Employee.builder()
                .employeeId(employeeEntity.getEmployeeId())
                .firstName(employeeEntity.getFirstName())
                .build());
    }

    @Override
    public void saveEmployee(Employee employee) {
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .employeeId(employee.getEmployeeId())
                .firstName(employee.getFirstName())
                .build();
        employeeRepository.save(employeeEntity);
    }
}
