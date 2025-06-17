package com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.ds.gateway;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.EmployeeEntity;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.mapper.EmployeeEntityMapper;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.repository.EmployeeRepository;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.ds.gateway.impl.EmployeeDsGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDsGatewayImpl implements EmployeeDsGateway {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> fetchEmployeeById(String employeeId) {
        Optional<EmployeeEntity> employeeEntityOptional = employeeRepository.findById(employeeId);
        return employeeEntityOptional.map(EmployeeEntityMapper::convertToModel);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        return employeeRepository.findAll().stream().map(EmployeeEntityMapper::convertToModel).toList();
    }

    @Override
    public boolean employeeExistsByEmail(String email) {
        return employeeRepository.existsByEmail(email);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(EmployeeEntityMapper.convertToEntity(employee));
    }
}
