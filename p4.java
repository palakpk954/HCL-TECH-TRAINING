class Animal04 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog04 extends Animal04 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat04 extends Animal04 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class p4 {
    public static void main(String[] args) {
        Dog04 dog = new Dog04();
        Cat04 cat = new Cat04();
        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}
