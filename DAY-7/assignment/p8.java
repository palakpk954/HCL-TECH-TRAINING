import java.util.Scanner;
import java.util.TreeSet;

public class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> scores = new TreeSet<>();
        
        System.out.print("Enter number of scores to add: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores.add(scanner.nextInt());
        }

        for (Integer score : scores) {
            System.out.println(score);
        }

        if (!scores.isEmpty()) {
            System.out.println(scores.first());
            System.out.println(scores.last());
        }
    }
}
