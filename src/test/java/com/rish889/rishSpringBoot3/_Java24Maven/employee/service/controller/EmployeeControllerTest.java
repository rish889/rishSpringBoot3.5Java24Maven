package com.rish889.rishSpringBoot3._Java24Maven.employee.service.controller;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = {EmployeeController.class})
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private EmployeeService employeeService;

    @Test
    void fetchEmployee() throws Exception {
        Mockito.when(this.employeeService.fetchEmployeeById("12")).thenReturn(Employee.builder()
                .employeeId("12")
                .firstName("John")
                .lastName("Doe")
                .email("john@doe.com")
                .build());

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/employee-service/v1/employees/12"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.content().string("{\"email\":\"john@doe.com\",\"employee_id\":\"12\",\"first_name\":\"John\",\"last_name\":\"Doe\"}"));

        Mockito.verify(this.employeeService, Mockito.times(1)).fetchEmployeeById("12");
    }
}