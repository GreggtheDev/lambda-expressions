package org.example;

@FunctionalInterface
interface MathOperation {
    double operate(double a, double b) throws ArithmeticException;
}

public class LambdaExample {
    public static void main(String[] args) {
        // Addition
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8.0

        // Subtraction
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.operate(5, 3)); // Output: 2.0

        // Multiplication
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operate(5, 3)); // Output: 15.0

        // Division with error handling for division by zero
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };
        try {
            System.out.println("Division: " + division.operate(6, 3)); // Output: 2.0
            System.out.println("Division by zero: " + division.operate(6, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


