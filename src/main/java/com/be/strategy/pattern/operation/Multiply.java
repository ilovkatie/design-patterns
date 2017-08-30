package com.be.strategy.pattern.operation;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("*")
public class Multiply implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }

    @Override
    public String getKey() {
        return "*";
    }
}
