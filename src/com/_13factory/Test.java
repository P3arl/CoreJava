package com._13factory;

public class Test {
    public static void main(String[] args) {
        CalculateFactory factory = new CalculateFactory();
        final Calculate divide = factory.getCalculation("divide");
        divide.calculate(8,3);
    }
}
