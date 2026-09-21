abstract class Shape13 {
    abstract double area();
}

class Circle13 extends Shape13 {
    private final double radius;

    Circle13(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle13 extends Shape13 {
    private final double length;
    private final double width;

    Rectangle13(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class p13 {
    public static void main(String[] args) {
        Shape13 shape = new Circle13(3);
        System.out.printf("Circle area: %.2f%n", shape.area());
        shape = new Rectangle13(4, 5);
        System.out.printf("Rectangle area: %.2f%n", shape.area());
    }
}
