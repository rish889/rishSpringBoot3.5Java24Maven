package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Entity;

public interface EntityService {
    Entity createEntity(Entity entity);

    Entity getEntity(String entityId);
}
