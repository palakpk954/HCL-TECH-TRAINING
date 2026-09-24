import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> empIds = new ArrayList<>();
        
        System.out.print("Enter number of employee IDs: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter employee ID " + (i + 1) + ": ");
            empIds.add(scanner.nextInt());
        }

        Iterator<Integer> iterator = empIds.iterator();
        while (iterator.hasNext()) {
            Integer id = iterator.next();
            if (id < 1005) {
                iterator.remove();
            }
        }

        for (Integer id : empIds) {
            System.out.println(id);
        }
    }
}
