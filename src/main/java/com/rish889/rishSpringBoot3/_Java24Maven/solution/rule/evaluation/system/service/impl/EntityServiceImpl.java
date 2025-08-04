package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service.impl;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Entity;
import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.repository.EntityRepository;
import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityServiceImpl implements EntityService {

    @Autowired
    private EntityRepository entityRepository;


    @Override
    public Entity createEntity(Entity entity) {
        return entityRepository.save(entity);
    }

    @Override
    public Entity getEntity(String entityId) {
        return entityRepository.findById(entityId).get();
    }
}
