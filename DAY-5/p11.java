abstract class Shape11 {
    abstract double calculateArea();
}

class Circle11 extends Shape11 {
    private final double radius;

    Circle11(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class p11 {
    public static void main(String[] args) {
        Shape11 circle = new Circle11(5);
        System.out.printf("Area: %.2f%n", circle.calculateArea());
    }
}
