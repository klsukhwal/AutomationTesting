package corejavaprograms;

public class TryBlockWithParameters {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        try {
            int result = divideNumbers(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
