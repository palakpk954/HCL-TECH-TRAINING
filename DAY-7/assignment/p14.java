import java.util.PriorityQueue;
import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> tasks = new PriorityQueue<>();
        
        System.out.print("Enter number of tasks: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter task priority (integer): ");
            tasks.offer(scanner.nextInt());
        }

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }// teh hpps is genetrate d yteh (sjsktajskt sk )
    }
}
