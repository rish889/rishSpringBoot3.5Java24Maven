package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.controller;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Rule;
import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @PostMapping("/api/v1/rules")
    public ResponseEntity<Rule> createRule(Rule rule) {
        return ResponseEntity.ok(ruleService.createRule(rule));
    }


    @GetMapping("/api/v1/rules/{ruleId}")
    public ResponseEntity<Rule> getRule(@PathVariable String ruleId) {
        return ResponseEntity.ok(ruleService.getRule(ruleId));
    }


    @GetMapping("/api/v1/rules")
    public ResponseEntity<List<Rule>> getRules() {
        return ResponseEntity.ok(ruleService.getRules());
    }
}
