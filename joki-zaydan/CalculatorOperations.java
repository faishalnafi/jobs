package kalkulator;

public class CalculatorOperations {
    public double evaluate(String expression) {
        return new ExpressionParser().parse(expression);
    }
}
