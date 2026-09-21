abstract class Employee12 {
    String name;

    Employee12(String name) {
        this.name = name;
    }

    abstract void work();
}

class Manager12 extends Employee12 {
    Manager12(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " manages the team");
    }
}

class Developer12 extends Employee12 {
    Developer12(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " writes code");
    }
}

public class p12 {
    public static void main(String[] args) {
        new Manager12("Priya").work();
        new Developer12("Rahul").work();
    }
}
