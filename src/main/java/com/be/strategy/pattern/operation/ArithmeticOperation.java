package com.be.strategy.pattern.operation;

import java.math.BigDecimal;

public interface ArithmeticOperation {

    BigDecimal execute(BigDecimal first, BigDecimal second);
}
