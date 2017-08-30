package com.be.strategy.pattern.operation;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("-")
public class Substract implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.subtract(second);
    }

    @Override
    public String getKey() {
        return "-";
    }
}
