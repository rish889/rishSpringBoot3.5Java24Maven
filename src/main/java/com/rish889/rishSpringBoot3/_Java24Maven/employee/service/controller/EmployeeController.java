package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.configs.ApiPaths;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeRequestDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeResponseDto;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.mapper.EmployeeDtoMapper;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(ApiPaths.EMPLOYEES)
    public @ResponseBody ResponseEntity<List<EmployeeResponseDto>> fetchAllEmployees() {
        log.debug("fetchAllEmployees()");
        List<Employee> employees = employeeService.fetchAllEmployees();
        return ResponseEntity.ok(employees.stream().map(EmployeeDtoMapper::convertToResponseDto).collect(Collectors.toList()));
    }

    @GetMapping(ApiPaths.EMPLOYEE_BY_ID)
    public @ResponseBody ResponseEntity<EmployeeResponseDto> fetchEmployee(@PathVariable String employeeId) {
        log.debug("fetchEmployee(). employeeId : {}", employeeId);
        Employee employee = employeeService.fetchEmployeeById(employeeId);
        return ResponseEntity.ok(EmployeeDtoMapper.convertToResponseDto(employee));
    }

    @PostMapping(ApiPaths.EMPLOYEES)
    public void saveEmployee(@Valid @RequestBody EmployeeRequestDto employeeRequestDto) {
        log.debug("saveEmployee(). employeeRequestDto : {}", employeeRequestDto);
        employeeService.saveEmployee(EmployeeDtoMapper.convertToModel(employeeRequestDto));
    }
}
