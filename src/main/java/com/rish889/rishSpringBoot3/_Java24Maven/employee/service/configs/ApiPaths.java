package com.rish889.rishSpringBoot3._Java24Maven.employee.service.configs;

public class ApiPaths {
    public static final String API_V1 = "/api/employee-service/v1";
    public static final String HEALTH_CHECK = API_V1 + "/health";
    public static final String EMPLOYEES = API_V1 + "/employees";
    public static final String EMPLOYEE_BY_ID = EMPLOYEES + "/{employeeId}";
}
