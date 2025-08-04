package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model;

import jakarta.persistence.Column;
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
@jakarta.persistence.Entity
@Table(name = "rules")
public class Rule {
    @Id
    @Column(name = "rule_id")
    private String ruleId;

    @Column(name = "entity_type")
    private String entityType;

    @Column(name = "expression")
    private String expression;
}
