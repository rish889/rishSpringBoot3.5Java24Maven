package com.rish889.rishSpringBoot3._Java24Maven.employee.service.service.impl;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.Employee;
import com.rish889.rishSpringBoot3._Java24Maven.employee.service.model.ds.gateway.impl.EmployeeDsGateway;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@Slf4j
@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {
    @Mock
    private EmployeeDsGateway employeeDsGateway;

    @InjectMocks
    private EmployeeServiceImpl employeeService;


    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
        MockitoAnnotations.initMocks(this);
    }


    @Test
    void fetchEmployeeById() {
        Mockito.when(employeeDsGateway.fetchEmployeeById("12")).thenReturn(Optional.ofNullable(Employee.builder()
                .employeeId("12")
                .firstName("John")
                .lastName("Doe")
                .email("john@doe.com")
                .build()));
        Assertions.assertEquals(Employee.builder()
                        .employeeId("12")
                        .firstName("John")
                        .lastName("Doe")
                        .email("john@doe.com")
                        .build(),
                employeeService.fetchEmployeeById("12"));
    }
}