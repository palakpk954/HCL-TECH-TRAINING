import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();
        
        System.out.print("Enter number of students to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            students.put(id, name);
        }

        System.out.print("Enter student ID to retrieve: ");
        int retrieveId = scanner.nextInt();
        scanner.nextLine();
        System.out.println(students.get(retrieveId));

        System.out.print("Enter student ID to update name: ");
        int updateId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new name: ");
        students.put(updateId, scanner.nextLine());
        
        System.out.print("Enter student ID to remove: ");
        int removeId = scanner.nextInt();
        students.remove(removeId);

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
