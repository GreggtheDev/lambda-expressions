package org.example;

@FunctionalInterface
interface StringOperation {
    String operate(String a, String b);
}

public class CustomLambdaExample {
    public static void main(String[] args) {
        // Concatenation
        StringOperation concat = (a, b) -> a + b;
        System.out.println("Concatenation: " + concat.operate("Hello, ", "World!")); // Output: Hello, World!

        // Uppercase Concatenation
        StringOperation upperConcat = (a, b) -> (a + b).toUpperCase();
        System.out.println("Uppercase Concatenation: " + upperConcat.operate("hello, ", "world!")); // Output: HELLO, WORLD!
    }
}

