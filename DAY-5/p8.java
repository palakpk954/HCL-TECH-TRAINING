class Student08 {
    int id;
    String name;

    Student08() {
        this(0, "Unknown");
    }

    Student08(int id) {
        this(id, "Unknown");
    }

    Student08(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}

public class p8 {
    public static void main(String[] args) {
        new Student08().display();
        new Student08(101).display();
        new Student08(102, "Anita").display();
    }
}
