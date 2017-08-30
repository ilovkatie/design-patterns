package com.be.strategy.pattern;

import com.be.strategy.pattern.operation.ArithmeticOperation;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RpnStrategy {

    @Resource
    private List<ArithmeticOperation> arithmeticOperations;
    private Map<String, ArithmeticOperation> operations;

    @PostConstruct
    public void init() {
        operations = new HashMap<>();
        arithmeticOperations.forEach(o -> operations.put(o.getKey(), o));
    }

    public String calculate(String firstToken, String secondToken, String operation) {
        BigDecimal first = new BigDecimal(firstToken);
        BigDecimal second = new BigDecimal(secondToken);
        return operations.get(operation).execute(first, second).toPlainString();
    }
}