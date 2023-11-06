package corejavaprograms;

class MyClass {
    private int privateVar;
    int defaultVar;
    protected int protectedVar;
    public int publicVar;
}
 
public class AccessModifiers {
	 public static void main(String[] args) {
	        MyClass obj = new MyClass();
	        obj.defaultVar = 10; 
	        obj.protectedVar = 20; 
	        obj.publicVar = 30;
	        
	        System.out.println("Default Variable: " + obj.defaultVar);
	        System.out.println("Protected Variable: " + obj.protectedVar);
	        System.out.println("Public Variable: " + obj.publicVar);
	 }
}
