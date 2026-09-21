public class q4 {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
		Cat cat = new Cat("baaby");

		dog.eat();
		dog.sleep();
		dog.bark();

		cat.eat();
		cat.sleep();
		cat.meow();
	}
}

class Q4Animal {
	private final String name;

	Q4Animal(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name + " is eating.");
	}

	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

class Dog1 extends Q4Animal {
	Dog1(String name) {
		super(name);
	}

	void bark() {
		System.out.println("Dog barks: Woof woof!");
	}
}

class Cat1 extends Q4Animal {
	Cat1(String name) {
		super(name);
	} 

	void meow() {
		System.out.println("Cat meows: Meow meow!");
	}
}
