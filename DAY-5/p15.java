interface Printable15 {
    void print();
}

interface Showable15 {
    void show();
}

class Demo15 implements Printable15, Showable15 {
    @Override
    public void print() {
        System.out.println("Printing multimedia content");
    }

    @Override
    public void show() {
        System.out.println("Showing multimedia content");
    }
}

public class p15 {
    public static void main(String[] args) {
        Demo15 demo = new Demo15();
        demo.print();
        demo.show();
    }
}
