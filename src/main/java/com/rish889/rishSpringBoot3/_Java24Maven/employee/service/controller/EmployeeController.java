package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping("/{id}")
    public EmployeeDto getEmployee(@PathVariable Long id) {
        // Logic to retrieve employee by ID (e.g., from a database)
        return new EmployeeDto(id, "John Doe");
    }

    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employee) {
        // Logic to create a new employee (e.g., save to database)
        return employee;
    }
}
