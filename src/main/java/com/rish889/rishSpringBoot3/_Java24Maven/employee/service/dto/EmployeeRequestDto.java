package com.rish889.rishSpringBoot3._Java24Maven.employee.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestDto {
    @NotBlank(message = "first_name must not be blank")
    @JsonProperty("first_name")
    private String firstName;

    @NotBlank(message = "last_name must not be blank")
    @JsonProperty("last_name")
    private String lastName;

    @NotBlank(message = "email must not be blank")
    private String email;
}
