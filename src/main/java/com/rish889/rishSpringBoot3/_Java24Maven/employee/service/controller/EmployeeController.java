package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.configs.ApiPaths;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(ApiPaths.EMPLOYEE_BY_ID)
    public @ResponseBody ResponseEntity<EmployeeDto> fetchEmployee(@PathVariable String employeeId) {
        log.info("getEmployee(). employeeId : {}", employeeId);
        Optional<Employee> employeeOptional = employeeService.fetchEmployeeById(employeeId);
        return ResponseEntity.ok(EmployeeDto.builder()
                .employeeId(employeeOptional.get().getEmployeeId())
                .firstName(employeeOptional.get().getFirstName())
                .build());
    }

    @PostMapping(ApiPaths.EMPLOYEES)
    public void saveEmployee(@RequestBody EmployeeDto employeeDto) {
        log.info("saveEmployee(). employeeId : {}", employeeDto.getEmployeeId());
        employeeService.saveEmployee(Employee.builder()
                .employeeId(employeeDto.getEmployeeId())
                .firstName(employeeDto.getFirstName())
                .build());
    }
}
