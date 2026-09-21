class Parent06 {
    String message = "Message from parent";

    void showMessage() {
        System.out.println("Parent method");
    }
}

class Child06 extends Parent06 {
    String message = "Message from child";

    void display() {
        System.out.println(message);
        System.out.println(super.message);
        super.showMessage();
    }
}

public class p6 {
    public static void main(String[] args) {
        new Child06().display();
    }
}
