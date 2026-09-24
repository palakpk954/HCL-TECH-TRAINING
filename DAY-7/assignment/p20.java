import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student20 implements Comparable<Student20> {
    int id;
    String name;
    int marks;

    public Student20(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student20 other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class p20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student20> students = new ArrayList<>();
        
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            
            students.add(new Student20(id, name, marks));
        }

        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students, Comparator.comparing(s -> s.name));
        System.out.println(students);

        Collections.sort(students, Comparator.comparingInt(s -> s.marks));
        System.out.println(students);
    }
}
