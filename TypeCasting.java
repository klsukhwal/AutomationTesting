package corejavaprograms;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		// Implicit Type Casting
		int intValue = 100;
        double doubleValue = intValue; 
        System.out.println("Implicit Type Casting: " + doubleValue);

        // Explicit Type Casting 
        double doubleValue2 = 123.45;
        int intValue2 = (int) doubleValue2; 
        System.out.println("Explicit Type Casting: " + intValue2);
        
	}

}
