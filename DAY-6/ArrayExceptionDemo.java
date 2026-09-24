import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an index (0-4) to retrieve the element: ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index entered! Please enter a value between 0 and " + (arr.length - 1) + ".");
        } finally {
            scanner.close();
            // wthe file van 
        }
    }
}
