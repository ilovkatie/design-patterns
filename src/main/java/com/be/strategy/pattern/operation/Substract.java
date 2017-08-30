package com.be.strategy.pattern.operation;

import java.math.BigDecimal;

public class Substract implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.subtract(second);
    }
}
