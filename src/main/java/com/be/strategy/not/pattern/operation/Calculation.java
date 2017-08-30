package com.be.strategy.not.pattern.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculation {

    private BigDecimal add(BigDecimal first, BigDecimal second) {
        return first.add(second);
    }

    private BigDecimal subtract(BigDecimal first, BigDecimal second) {
        return first.subtract(second);
    }

    private BigDecimal multiply(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }

    private BigDecimal divide(BigDecimal first, BigDecimal second) {
        return first.divide(second, RoundingMode.HALF_UP);
    }

    public String calculate(String firstToken, String secondToken, Operation operation) {
        BigDecimal first = new BigDecimal(firstToken);
        BigDecimal second = new BigDecimal(secondToken);
        switch (operation) {
            case ADD:
                return add(first, second).toPlainString();
            case SUBSTRACT:
                return subtract(first, second).toPlainString();
            case MULTIPLY:
                return multiply(first, second).toPlainString();
            case DIVIDE:
                return divide(first, second).toPlainString();
            default:
                return BigDecimal.ZERO.toPlainString();
        }
    }
}
