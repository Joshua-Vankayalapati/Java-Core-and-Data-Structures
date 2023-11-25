package com.example.javaBuildingBlocks;

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Arithmetic Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    double additionResult = num1 + num2;
                    System.out.println("Result: " + additionResult);
                    break;
                case 2:
                    double subtractionResult = num1 - num2;
                    System.out.println("Result: " + subtractionResult);
                    break;
                case 3:
                    double multiplicationResult = num1 * num2;
                    System.out.println("Result: " + multiplicationResult);
                    break;
                case 4:
                    if (num2 != 0) {
                        double divisionResult = num1 / num2;
                        System.out.println("Result: " + divisionResult);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-5).");
            }

            System.out.println();
        }

        scanner.close();
    }
}
