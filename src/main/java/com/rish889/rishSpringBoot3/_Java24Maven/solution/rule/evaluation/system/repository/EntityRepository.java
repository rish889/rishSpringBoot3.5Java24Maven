package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.repository;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<Entity, String> {
}
