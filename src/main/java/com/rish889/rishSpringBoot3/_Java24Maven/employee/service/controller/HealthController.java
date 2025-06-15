package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.configs.ApiPaths;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(ApiPaths.HEALTH_CHECK)
    public String healthCheck() {
        return "Employee service is healthy";
    }
}