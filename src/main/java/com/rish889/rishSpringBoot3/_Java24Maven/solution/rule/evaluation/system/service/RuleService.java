package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Rule;

import java.util.List;

public interface RuleService {
    Rule createRule(Rule rule);

    Rule getRule(String ruleId);

    List<Rule> getRules();
}
