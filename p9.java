class Animal09 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog09 extends Animal09 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat09 extends Animal09 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class p9 {
    public static void main(String[] args) {
        new Dog09().sound();
        new Cat09().sound();
    }
}
