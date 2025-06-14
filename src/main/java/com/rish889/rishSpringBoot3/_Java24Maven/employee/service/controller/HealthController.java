package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee-service/v1/health")
public class HealthController {

    @GetMapping()
    public String healthCheck() {
        return "Employee service is healthy";
    }
}