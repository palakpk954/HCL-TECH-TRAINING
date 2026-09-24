import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> studentNames = new ArrayList<>();
        Set<String> uniqueCourses = new HashSet<>();
        Map<Integer, String> studentMap = new HashMap<>();
        Queue<String> waitingQueue = new LinkedList<>();

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            studentNames.add(name);
            studentMap.put(id, name);
        }

        System.out.print("Enter number of courses to add: ");
        int courseCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < courseCount; i++) {
            System.out.print("Enter course name: ");
            uniqueCourses.add(scanner.nextLine());
        }

        System.out.print("Enter number of waiting students: ");
        int waitCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < waitCount; i++) {
            System.out.print("Enter waiting student name: ");
            waitingQueue.offer(scanner.nextLine());
        }

        System.out.println(studentNames);
        System.out.println(uniqueCourses);
        System.out.println(studentMap);
        System.out.println(waitingQueue);
    }
}
