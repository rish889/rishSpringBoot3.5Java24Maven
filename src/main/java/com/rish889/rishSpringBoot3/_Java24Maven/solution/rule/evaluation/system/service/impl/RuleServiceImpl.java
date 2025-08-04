package com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service.impl;

import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.model.Rule;
import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.repository.RuleRepository;
import com.rish889.rishSpringBoot3._Java24Maven.solution.rule.evaluation.system.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private RuleRepository ruleRepository;

    @Override
    public Rule createRule(Rule rule) {
        return ruleRepository.save(rule);
    }

    @Override
    public Rule getRule(String ruleId) {
        return ruleRepository.findById(ruleId).get();
    }

    @Override
    public List<Rule> getRules() {
        return ruleRepository.findAll();
    }
}
