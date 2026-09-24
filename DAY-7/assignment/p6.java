import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> studentIds = new HashSet<>();
        
        System.out.print("Enter number of student IDs to add: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID " + (i + 1) + ": ");
            studentIds.add(scanner.nextInt());
        }

        for (Integer id : studentIds) {
            System.out.println(id);
        }

        System.out.print("Enter a student ID to check if it exists: ");
        int checkId = scanner.nextInt();
        System.out.println(studentIds.contains(checkId));
    }
}
