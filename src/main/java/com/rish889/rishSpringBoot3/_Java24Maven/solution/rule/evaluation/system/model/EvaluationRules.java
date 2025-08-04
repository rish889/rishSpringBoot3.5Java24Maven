package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@jakarta.persistence.Entity
@Table(name = "evaluation_rules")
public class EvaluationRules {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "evaluation_rule_id")
    private String evaluationRuleId;

    @Column(name = "evaluation_id")
    private String evaluationId;

    @Column(name = "rule_id")
    private String ruleId;

    @Column(name = "status")
    private EvaluationRuleStatus status;
}



