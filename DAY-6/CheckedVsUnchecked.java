import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        // 1. Checked Exception (File operation)
        System.out.println("--- Checked Exception Example ---");
        try {
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Handled: " + e.getMessage());
        }

        // 2. Unchecked Exception (Array operation)
        System.out.println("\n--- Unchecked Exception Example ---");
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Handled: " + e.getMessage());
        }
    }
}
