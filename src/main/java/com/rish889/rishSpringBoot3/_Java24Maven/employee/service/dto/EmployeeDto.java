package com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    @JsonProperty("employee_id")
    private String employeeId;
    @JsonProperty("first_name")
    private String firstName;
}