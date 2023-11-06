package corejavaprograms;

//Class definition
class Student {
 String fullName;
 int studentAge;

 // Constructor
 public Student(String fullName, int studentAge) {
     this.fullName = fullName;
     this.studentAge = studentAge;
 }

 // Method to display student information
 public void displayInfo() {
     System.out.println("Full Name: " + fullName);
     System.out.println("Age: " + studentAge);
 }
}

public class StudentInfoSystem {
 public static void main(String[] args) {
     // Creating objects of the Student class using constructors
     Student student1 = new Student("Kishan", 23);
     Student student2 = new Student("Anjali", 23);

     // Calling methods on objects
     System.out.println("Student 1 Information:");
     student1.displayInfo(); 

     System.out.println("\nStudent 2 Information:");
     student2.displayInfo(); 
 }
}

