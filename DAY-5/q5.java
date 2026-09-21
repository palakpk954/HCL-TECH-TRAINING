class Animal {
	void eat() {
		System.out.println("Animal eats");
	}
}
class Mammal extends Animal {
	void walk() {
		System.out.println("Mammal walks");
	}
}

class Dog extends Mammal {
	void bark() {
		System.out.println("Dog barks");
	}
}

public class q5 {
	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.eat();   // Method inherited from Animal
		dog.walk();  // Method inherited from Mammal
		dog.bark();  // Dog's own method
	}
}
