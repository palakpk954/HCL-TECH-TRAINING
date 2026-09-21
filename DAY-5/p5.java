class Parent05 {
    Parent05() {
        System.out.println("Parent constructor executed");
    }
}

class Child05 extends Parent05 {
    Child05() {
        System.out.println("Child constructor executed");
    }
}

public class p5 {
    public static void main(String[] args) {
        new Child05();
    }
}
