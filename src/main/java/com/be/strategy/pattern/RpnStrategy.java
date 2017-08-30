package com.be.strategy.pattern;

import com.be.strategy.pattern.operation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RpnStrategy {

    private Map<String, ArithmeticOperation> operations;

    public RpnStrategy() {
        operations = new HashMap<>();
        operations.put("+", new Add());
        operations.put("-", new Substract());
        operations.put("*", new Multiply());
        operations.put("/", new Divide());
    }

    public String calculate(String firstToken, String secondToken, String operation) {
        BigDecimal first = new BigDecimal(firstToken);
        BigDecimal second = new BigDecimal(secondToken);
        return operations.get(operation).execute(first, second).toPlainString();
    }

    public Map<String, ArithmeticOperation> getOperations() {
        return operations;
    }
}
