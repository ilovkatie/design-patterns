package com.be.strategy.pattern.operation;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Add implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.add(second);
    }

    @Override
    public String getKey() {
        return "+";
    }
}
