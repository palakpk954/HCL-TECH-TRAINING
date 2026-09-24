import java.util.ArrayList;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        
        System.out.print("Enter number of marks: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks.add(scanner.nextInt());
        }

        for (Integer mark : marks) {
            System.out.println(mark);
        }

        if (!marks.isEmpty()) {
            int total = 0;
            int highest = marks.get(0);
            int lowest = marks.get(0);

            for (Integer mark : marks) {
                total += mark;
                if (mark > highest) {
                    highest = mark;
                }
                if (mark < lowest) {
                    lowest = mark;
                }
            }

            double average = (double) total / marks.size();

            System.out.println(total);
            System.out.println(average);
            System.out.println(highest);
            System.out.println(lowest);
        }
    }
}
