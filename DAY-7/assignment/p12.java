import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> products = new LinkedHashMap<>();
        
        System.out.print("Enter number of products: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            products.put(id, name);
        }

        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
