package com.be.strategy.pattern.operation;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component("/")
public class Divide implements ArithmeticOperation {

    @Override
    public BigDecimal execute(BigDecimal first, BigDecimal second) {
        return first.divide(second, RoundingMode.HALF_UP);
    }

    @Override
    public String getKey() {
        return "/";
    }
}
