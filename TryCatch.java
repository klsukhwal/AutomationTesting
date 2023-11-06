package corejavaprograms;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            int result = 10 / number;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } finally {
            System.out.println("This block is always executed, regardless of exceptions.");
            scanner.close();
        }
    }
}
