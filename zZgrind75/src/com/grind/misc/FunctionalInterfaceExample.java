package com.grind.misc;
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using the functional interface with a lambda expression for addition
        MathOperation addition = (a, b) -> a + b;
        System.out.println("10 + 5 = " + addition.operate(10, 5));

        // Using the functional interface with a lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("10 - 5 = " + subtraction.operate(10, 5));

        // Using the functional interface with a lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("10 * 5 = " + multiplication.operate(10, 5));

        // Using the functional interface with a lambda expression for division
        MathOperation division = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Division by zero");
            return a / b;
        };
        System.out.println("10 / 5 = " + division.operate(10, 5));
    }
}
