package com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "first_name")
    private String firstName;
}
