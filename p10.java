class Animal10 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog10 extends Animal10 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat10 extends Animal10 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class p10 {
    public static void main(String[] args) {
        Animal10 animal = new Dog10();
        animal.sound();
        animal = new Cat10();
        animal.sound();
    }
}
