package com.be.strategy.not.pattern.operation;

public enum Operation {
    ADD("+"),
    SUBSTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String operator;

    Operation(String operator) {
        this.operator = operator;
    }

    public static Operation getByOperand(String operator) {
        for (Operation operation : values()) {
            if (operation.getOperator().equals(operator)) {
                return operation;
            }
        }
        return null;
    }

    public String getOperator() {
        return operator;
    }
}
