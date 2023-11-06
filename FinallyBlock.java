package corejavaprograms;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

