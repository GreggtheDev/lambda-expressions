# Lambda Expressions Assignment

This assignment focuses on practicing the use of lambda expressions in Java. The tasks are divided into three parts: implementing custom functional interfaces, using lambda expressions with those interfaces, and working with Java's built-in functional interfaces.

## Objectives

- Understand and apply lambda expressions in Java.
- Use lambda expressions with custom functional interfaces.
- Use lambda expressions with Java's built-in functional interfaces such as `Predicate`, `Function`, `Consumer`, and `Supplier`.

## Task 1: MathOperation.java

In this task, you will create simple lambda expressions to perform basic arithmetic operations.

### MathOperation.java

- Define a `MathOperation` functional interface with an `operate` method.
- Implement lambda expressions for addition, subtraction, multiplication, and division.
- Test and print results of arithmetic operations in the `LambdaExample` class.

## Task 2: StringOperation.java

In this task, you will create your own functional interface and use lambda expressions to manipulate strings.

### StringOperation.java

- Define a `StringOperation` functional interface with an `operate` method.
- Implement lambda expressions for string concatenation and uppercase concatenation.
- Test and print results of string operations in the `CustomLambdaExample` class.

## Task 3: BuiltInLambdaExample.java

In this task, you will use lambda expressions with Java's built-in functional interfaces.

### BuiltInLambdaExample.java

- Use `Predicate` to check if a number is positive.
- Use `Function` to convert a string to its length.
- Use `Consumer` to print a string.
- Use `Supplier` to supply a default message.
- Test and print results of each lambda expression in the `BuiltInLambdaExample` class.

## How to Run

1. Compile the Java files using `javac`.
2. Run each task's main class to see the output of the lambda expressions.

```bash
javac MathOperation.java
java LambdaExample

javac StringOperation.java
java CustomLambdaExample

javac BuiltInLambdaExample.java
java BuiltInLambdaExample
```

## Summary

This assignment helps in understanding and applying lambda expressions in Java through the creation and use of both custom and built-in functional interfaces. By completing these tasks, you will gain hands-on experience in writing more concise and readable code using lambda expressions.
```

This README provides clear instructions and explanations for each task without including the full Java code, making it concise and easy to follow.
