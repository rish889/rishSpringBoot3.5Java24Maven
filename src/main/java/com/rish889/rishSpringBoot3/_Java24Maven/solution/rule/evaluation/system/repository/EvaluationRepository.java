package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.repository;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, String> {
}
