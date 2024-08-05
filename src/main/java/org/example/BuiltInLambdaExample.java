package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInLambdaExample {
    public static void main(String[] args) {
        // Predicate: checks if a number is positive
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5)); // Output: true

        // Function: converts a string to its length
        Function<String, Integer> stringLength = str -> {
            if (str == null) {
                throw new NullPointerException("String is null");
            }
            return str.length();
        };
        try {
            System.out.println("Length of 'Hello': " + stringLength.apply("Hello")); // Output: 5
            System.out.println("Length of null: " + stringLength.apply(null)); // This will throw an exception
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Consumer: prints a string
        Consumer<String> printString = str -> {
            if (str == null) {
                throw new NullPointerException("String is null");
            }
            System.out.println(str);
        };
        try {
            printString.accept("This is a test string."); // Output: This is a test string.
            printString.accept(null); // This will throw an exception
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Supplier: supplies a default message
        Supplier<String> defaultMessage = () -> "Default Message";
        System.out.println("Supplier: " + defaultMessage.get()); // Output: Default Message
    }
}


