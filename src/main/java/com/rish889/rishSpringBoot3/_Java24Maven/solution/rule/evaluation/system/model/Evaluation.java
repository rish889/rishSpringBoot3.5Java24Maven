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
@Table(name = "evaluations")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "evaluation_id")
    private String evaluationId;

    @Column(name = "entity_id")
    private String entityId;

    @Column(name = "status")
    private EvaluationStatus status;
}



