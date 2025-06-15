package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.configs.ApiPaths;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class EmployeeController {

    @GetMapping(ApiPaths.EMPLOYEE_BY_ID)
    public @ResponseBody ResponseEntity<EmployeeDto> fetchEmployee(@PathVariable String employeeId) {
        log.info("getEmployee(). employeeId : {}", employeeId);
        return ResponseEntity.ok(new EmployeeDto(employeeId, "John Doe"));
    }

    @PostMapping(ApiPaths.EMPLOYEES)
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employee) {
        return employee;
    }
}
