interface Shape14 {
    double area();
}

class Circle14 implements Shape14 {
    private final double radius;

    Circle14(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class p14 {
    public static void main(String[] args) {
        Shape14 circle = new Circle14(4);
        System.out.printf("Area: %.2f%n", circle.area());
    }
}
