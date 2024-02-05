/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package advancedcalculator;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Advanced Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Exponentiation");
        System.out.println("7. Factorial");
        System.out.println("8. Exit");

        int choice;
        do {
            System.out.print("Enter your choice (1-8): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performExponentiation(scanner);
                    break;
                case 7:
                    performFactorial(scanner);
                    break;
                case 8:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);

        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 + num2));
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 - num2));
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 * num2));
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();
        
        if (denominator != 0) {
            System.out.println("Result: " + (numerator / denominator));
        } else {
            System.out.println("Error: Division by zero.");
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter the number: ");
        double num = scanner.nextDouble();
        
        if (num >= 0) {
            System.out.println("Result: " + Math.sqrt(num));
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number.");
        }
    }

    private static void performExponentiation(Scanner scanner) {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println("Result: " + Math.pow(base, exponent));
    }

    private static void performFactorial(Scanner scanner) {
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        
        if (num >= 0) {
            System.out.println("Result: " + calculateFactorial(num));
        } else {
            System.out.println("Error: Cannot calculate factorial of a negative number.");
        }
    }

    private static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}

