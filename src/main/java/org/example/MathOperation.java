package org.example;

@FunctionalInterface
interface MathOperation {
    double operate(double a, double b);
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

        // Division
        MathOperation division = (a, b) -> a / b;
        System.out.println("Division: " + division.operate(6, 3)); // Output: 2.0
    }
}

