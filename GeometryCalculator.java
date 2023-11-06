package corejavaprograms;

import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a geometric shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                area = calculateCircleArea(radius);
                break;
            case 2:
                System.out.println("Enter the length and width of the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                area = calculateRectangleArea(length, width);
                break;
            case 3:
                System.out.println("Enter the base and height of the triangle:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                area = calculateTriangleArea(base, height);
                break;
            case 4:
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                area = calculateSquareArea(side);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Area: " + area);
        scanner.close();
    }

    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    
    public static double calculateSquareArea(double side) {
        return side * side;
    }
}
