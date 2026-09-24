import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        System.out.print("Enter number of names: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(scanner.nextLine());
        }

        for (String name : names) {
            System.out.println(name);
        }
        
        System.out.print("Enter a new name to add: ");
        names.add(scanner.nextLine());
        
        System.out.print("Enter index to update: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new name for index " + index + ": ");
        names.set(index, scanner.nextLine());
        
        System.out.print("Enter name to remove: ");
        names.remove(scanner.nextLine());

        for (String name : names) {
            System.out.println(name);
        }
    }
}
