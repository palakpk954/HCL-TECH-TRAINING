class Animal {
	void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal {
	void barks() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	void meow(){
		System.out.println("cat meows");
	}
}
public class q2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.eat(); 
		dog.barks();
		
		Cat cat = new Cat();
		cat.meow();
		
	}
}
