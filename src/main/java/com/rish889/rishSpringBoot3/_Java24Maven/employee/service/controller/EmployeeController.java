package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.configs.ApiPaths;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeRequestDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeResponseDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(ApiPaths.EMPLOYEES)
    public @ResponseBody ResponseEntity<EmployeeResponseDto> fetchAllEmployees() {
        log.debug("fetchAllEmployees()");
        Employee employee = employeeService.fetchEmployeeById("employeeId");
        return ResponseEntity.ok(EmployeeResponseDto.builder()
                .employeeId(employee.getEmployeeId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .build());
    }

    @GetMapping(ApiPaths.EMPLOYEE_BY_ID)
    public @ResponseBody ResponseEntity<EmployeeResponseDto> fetchEmployee(@PathVariable String employeeId) {
        log.debug("fetchEmployee(). employeeId : {}", employeeId);
        Employee employee = employeeService.fetchEmployeeById(employeeId);
        return ResponseEntity.ok(EmployeeResponseDto.builder()
                .employeeId(employee.getEmployeeId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .build());
    }

    @PostMapping(ApiPaths.EMPLOYEES)
    public void saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto) {
        log.debug("saveEmployee(). employeeRequestDto : {}", employeeRequestDto);
        employeeService.saveEmployee(Employee.builder()
                .employeeId(UUID.randomUUID().toString())
                .firstName(employeeRequestDto.getFirstName())
                .lastName(employeeRequestDto.getLastName())
                .email(employeeRequestDto.getEmail())
                .build());
    }
}
