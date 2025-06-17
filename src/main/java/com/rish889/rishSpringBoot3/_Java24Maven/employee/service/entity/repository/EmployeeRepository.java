package com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.repository;

import com.rish889.rishSpringBoot3._Java24Maven.employee.service.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {
    boolean existsByEmail(String email);
}
