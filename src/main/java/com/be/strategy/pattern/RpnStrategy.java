package com.be.strategy.pattern;

import com.be.strategy.pattern.operation.ArithmeticOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class RpnStrategy {

    private Map<String, ArithmeticOperation> operations;

    @Autowired
    RpnStrategy(List<ArithmeticOperation> arithmeticOperations) {
        operations = arithmeticOperations
                .stream()
                .collect(Collectors.toMap(ArithmeticOperation::getKey, Function.identity()));
    }

    public String calculate(String firstToken, String secondToken, String operation) {
        BigDecimal first = new BigDecimal(firstToken);
        BigDecimal second = new BigDecimal(secondToken);
        return operations.get(operation).execute(first, second).toPlainString();
    }
}