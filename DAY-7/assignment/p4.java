import java.util.LinkedList;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();
        
        System.out.print("Enter number of tasks to add initially: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter task: ");
            tasks.add(scanner.nextLine());
        }

        System.out.print("Enter a task to add at the beginning: ");
        tasks.addFirst(scanner.nextLine());
        
        System.out.print("Enter a task to add at the end: ");
        tasks.addLast(scanner.nextLine());

        if (!tasks.isEmpty()) {
            tasks.removeFirst();
        }
        if (!tasks.isEmpty()) {
            tasks.removeLast();
        }

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
