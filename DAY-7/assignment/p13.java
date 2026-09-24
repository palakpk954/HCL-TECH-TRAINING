import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> customers = new LinkedList<>();
        
        System.out.print("Enter number of customers to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter customer name: ");
            customers.offer(scanner.nextLine());
        }

        if (!customers.isEmpty()) {
            System.out.println(customers.peek());
            System.out.println(customers.poll());
        }

        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
