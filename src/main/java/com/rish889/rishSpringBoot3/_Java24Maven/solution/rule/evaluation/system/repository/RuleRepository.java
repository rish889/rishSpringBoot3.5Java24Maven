package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.repository;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Rule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuleRepository extends JpaRepository<Rule, String> {
}
