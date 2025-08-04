package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.repository;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.EvaluationRules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRuleRepository extends JpaRepository<EvaluationRules, String> {
}
