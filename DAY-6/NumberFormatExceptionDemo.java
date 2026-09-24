import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        
        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered the integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: You entered a non-numeric or invalid value.");
        } finally {
            scanner.close();
        }
    }
}
