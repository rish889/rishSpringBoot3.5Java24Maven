package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee-service/v1/employees")
@Slf4j
public class EmployeeController {

    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<EmployeeDto> getEmployee(@PathVariable String id) {
        log.info("getEmployee(). id : {}", id);
        return ResponseEntity.ok(new EmployeeDto(id, "John Doe"));
    }

    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employee) {
        return employee;
    }
}
