class Animal {
	void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();  // Inherited behavior
		dog.bark(); // Dog-specific behavior
	}
}
