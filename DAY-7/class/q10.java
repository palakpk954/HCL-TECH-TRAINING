1import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // PriorityQueue automatically orders elements according to their natural ordering (smallest first for integers)
        Queue<Integer> pq = new PriorityQueue<>();
        int choice;

        do {
            System.out.println("\n--- Priority Queue Operations Menu ---");
            System.out.println("1. Add element (offer)");
            System.out.println("2. Remove highest priority element (poll)");
            System.out.println("3. View highest priority element (peek)");
            System.out.println("4. Check if empty (isEmpty)");
            System.out.println("5. Check size (size)");
            System.out.println("6. Display all elements (internal array state)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer value to add: ");
                    int value = scanner.nextInt();
                    pq.offer(value);
                    System.out.println("Value " + value + " added to Priority Queue.");
                    break;
                case 2:
                    if (pq.isEmpty()) {
                        System.out.println("Priority Queue is empty! Cannot poll.");
                    } else {
                        // In a PriorityQueue of Integers, poll() will always remove and return the smallest number
                        System.out.println("Removed highest priority element (poll): " + pq.poll());
                    }
                    break;
                case 3:
                    if (pq.isEmpty()) {
                        System.out.println("Priority Queue is empty! Nothing to peek.");
                    } else {
                        // peek() returns the smallest number without removing it
                        System.out.println("Highest priority element (peek): " + pq.peek());
                    }
                    break;
                case 4:
                    System.out.println("Is the Priority Queue empty? " + pq.isEmpty());
                    break;
                case 5:
                    System.out.println("Priority Queue size: " + pq.size());
                    break;
                case 6:
                    // Note: Printing a PriorityQueue does not guarantee the elements will be printed in sorted order.
                    // Only poll() and peek() guarantee retrieving the elements in priority order.
                    System.out.println("Current Priority Queue (internal structure): " + pq);
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
