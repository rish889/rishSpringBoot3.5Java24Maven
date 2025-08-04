package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.controller;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Entity;
import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

    @Autowired
    private EntityService entityService;

    @PostMapping("/api/v1/entities")
    public ResponseEntity<Entity> createEntity(Entity entity) {
        return ResponseEntity.ok(entityService.createEntity(entity));
    }


    @GetMapping("/api/v1/entities{entityId}")
    public ResponseEntity<Entity> getEntity(@PathVariable String entityId) {
        return ResponseEntity.ok(entityService.getEntity(entityId));
    }
}
