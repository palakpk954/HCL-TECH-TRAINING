class Animal03 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal03 extends Animal03 {
    void breathe() {
        System.out.println("Mammal breathes air");
    }
}

class Dog03 extends Mammal03 {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class p3 {
    public static void main(String[] args) {
        Dog03 dog = new Dog03();
        dog.eat();
        dog.breathe();
        dog.bark();
    }
}
