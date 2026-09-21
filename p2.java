class Animal02 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog02 extends Animal02 {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class p2 {
    public static void main(String[] args) {
        Dog02 dog = new Dog02();
        dog.eat();
        dog.bark();
    }
}
