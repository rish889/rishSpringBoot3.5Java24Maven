package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
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
@Table(name = "properties")
public class Properties {
    @Id
    @GeneratedValue
    @Column(name = "property_id")
    private String propertyId;

    @Column(name = "entity_id")
    private String entityId;

    @Column(name = "entity_id")
    private String propertyName;

    @Column(name = "entity_id")
    private String propertyValue;
}



