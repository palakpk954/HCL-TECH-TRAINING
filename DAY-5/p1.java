class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println(brand + " car is driving");
    }
}

public class p1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
