package com.be.strategy.pattern.operation;

import java.math.BigDecimal;

public class Add implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.add(second);
    }
}
