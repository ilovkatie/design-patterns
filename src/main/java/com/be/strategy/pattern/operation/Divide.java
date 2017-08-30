package com.be.strategy.pattern.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.divide(second, RoundingMode.HALF_UP);
    }
}
