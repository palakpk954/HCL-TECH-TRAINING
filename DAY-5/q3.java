class Vehicle {
    Vehicle() {
        System.out.println("this is car factory");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("This is honda showroom");
    }
}

class Bus extends Car {
    Bus() {
        System.out.println("This is the bus");
    }
}

public class q3 {
    public static void main(String[] args) {
        new Bus();
    }
}
