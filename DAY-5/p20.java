interface Payable20 {
    double calculatePay();
}

abstract class Employee20 implements Payable20 {
    protected final String name;
    protected final double salary;

    Employee20(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    @Override
    public double calculatePay() {
        return salary;
    }
}

class Manager20 extends Employee20 {
    Manager20(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " manages projects");
    }

    @Override
    public double calculatePay() {
        return salary + 5000;
    }
}

class Developer20 extends Employee20 {
    Developer20(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " develops software");
    }
}

public class p20 {
    public static void main(String[] args) {
        Employee20 employee = new Manager20("Meera", 60000);
        employee.work();
        System.out.println("Pay: " + employee.calculatePay());

        employee = new Developer20("Arjun", 50000);
        employee.work();
        System.out.println("Pay: " + employee.calculatePay());
    }
}
