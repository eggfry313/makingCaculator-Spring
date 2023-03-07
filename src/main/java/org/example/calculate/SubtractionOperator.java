package org.example.calculate;

public class SubtractionOperator implements NewArithmeticCalculator {
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toIne() - operand2.toIne();
    }
}
