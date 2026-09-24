import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> categories = new LinkedHashSet<>();
        
        System.out.print("Enter number of product categories to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter category " + (i + 1) + ": ");
            categories.add(scanner.nextLine());
        }

        for (String category : categories) {
            System.out.println(category);
        }
    }
}
