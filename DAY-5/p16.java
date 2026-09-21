class Vehicle16 {
    void start() {
        System.out.println("Vehicle starts");
    }
}

interface Fare16 {
    double calculateFare(int kilometers);
}

class Bus16 extends Vehicle16 implements Fare16 {
    @Override
    public double calculateFare(int kilometers) {
        return kilometers * 2.5;
    }
}

public class p16 {
    public static void main(String[] args) {
        Bus16 bus = new Bus16();
        bus.start();
        System.out.println("Fare: " + bus.calculateFare(10));
    }
}
