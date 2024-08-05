package org.example;

@FunctionalInterface
interface StringOperation {
    String operate(String a, String b) throws NullPointerException;
}

public class CustomLambdaExample {
    public static void main(String[] args) {
        // Concatenation
        StringOperation concat = (a, b) -> {
            if (a == null || b == null) {
                throw new NullPointerException("One of the strings is null");
            }
            return a + b;
        };
        try {
            System.out.println("Concatenation: " + concat.operate("Hello, ", "World!")); // Output: Hello, World!
            System.out.println("Concatenation with null: " + concat.operate("Hello, ", null)); // This will throw an exception
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Uppercase Concatenation
        StringOperation upperConcat = (a, b) -> {
            if (a == null || b == null) {
                throw new NullPointerException("One of the strings is null");
            }
            return (a + b).toUpperCase();
        };
        try {
            System.out.println("Uppercase Concatenation: " + upperConcat.operate("hello, ", "world!")); // Output: HELLO, WORLD!
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


