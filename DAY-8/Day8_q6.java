import java.util.Scanner;

public class Day8_q6 {

    // A generic method that restricts T to only types that can be compared (Comparable)
    static <T extends Comparable<T>> void compareNumbers(T a, T b) {
        
        if (a.compareTo(b) > 0) {
            System.out.println(a + " is greater than " + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Generic Number Comparator ---");
        
        // Taking Integer input
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        // Calling our generic method
        compareNumbers(num1, num2);
        
        System.out.println("\n---------------------------------");
        
        // Taking Double input
        System.out.print("Enter first decimal (double): ");
        double decimal1 = scanner.nextDouble();
        
        System.out.print("Enter second decimal (double): ");
        double decimal2 = scanner.nextDouble();
        
        // Calling our generic method again
        compareNumbers(decimal1, decimal2);
        
        scanner.close();
    }
}
