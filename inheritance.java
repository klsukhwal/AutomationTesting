package corejavaprograms;

//Base class
class Animal {
 void eat() {
     System.out.println("Animal is eating.");
 }
}

//Derived class (inherits from Animal)
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking.");
 }
}

//Derived class (inherits from Animal)
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing.");
 }
}

public class inheritance {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     Cat myCat = new Cat();

     myDog.eat();  // Inherited from Animal
     myDog.bark(); // Dog's own method

     myCat.eat();  // Inherited from Animal
     myCat.meow(); // Cat's own method
 }
}

