import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student17 {
    int id;
    String name;

    public Student17(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class p17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student17> students = new ArrayList<>();
        
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            students.add(new Student17(id, name));
        }

        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

        for (Student17 student : students) {
            System.out.println(student);
        }
    }
}
