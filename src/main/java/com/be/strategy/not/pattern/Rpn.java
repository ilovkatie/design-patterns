package com.be.strategy.not.pattern;

import com.be.strategy.not.pattern.operation.Calculation;
import com.be.strategy.not.pattern.operation.Operation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Rpn {

    private static final String TOKEN_DELIMITER = " ";

    public String calculate(String expression) {
        Calculation calculation = new Calculation();
        String[] splitExpression = expression.split(TOKEN_DELIMITER);
        Deque<String> stack = new ArrayDeque<>();
        for (String token : splitExpression) {
            Operation operation = Operation.getByOperand(token);
            if (Operation.getByOperand(token) == null) {
                stack.push(token);
            } else {
                String second = stack.pop();
                String first = stack.pop();
                stack.push(calculation.calculate(first, second, operation));
            }
        }
        return stack.pop();
    }
}
