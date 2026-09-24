import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cities = new HashSet<>();
        
        System.out.print("Enter 10 city names (some can be duplicates): ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            cities.add(scanner.nextLine());
        }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
