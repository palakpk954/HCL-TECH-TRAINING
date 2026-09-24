import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> taskQueue = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n--- Queue Operations Menu ---");
            System.out.println("1. Add task (offer)");
            System.out.println("2. Remove task (poll)");
            System.out.println("3. View next task (peek)");
            System.out.println("4. Check if empty (isEmpty)");
            System.out.println("5. Check size (size)");
            System.out.println("6. Display all tasks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name to add: ");
                    String task = scanner.nextLine();
                    taskQueue.offer(task);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    if (taskQueue.isEmpty()) {
                        System.out.println("Queue is empty! Cannot poll.");
                    } else {
                        System.out.println("Removed task (poll): " + taskQueue.poll());
                    }
                    break;
                case 3:
                    if (taskQueue.isEmpty()) {
                        System.out.println("Queue is empty! Nothing to peek.");
                    } else {
                        System.out.println("Next task (peek): " + taskQueue.peek());
                    }
                    break;
                case 4:
                    System.out.println("Is the queue empty? " + taskQueue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue size: " + taskQueue.size());
                    break;
                case 6:
                    System.out.println("Current Queue: " + taskQueue);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
