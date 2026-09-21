interface Shape19 {
    void draw();
}

class Circle19 implements Shape19 {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle19 implements Shape19 {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class p19 {
    public static void main(String[] args) {
        Shape19 shape = new Circle19();
        shape.draw();
        shape = new Rectangle19();
        shape.draw();
    }
}
