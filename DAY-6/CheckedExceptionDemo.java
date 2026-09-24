import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        // Checked exceptions are checked at compile-time
        try {
            FileInputStream fis = new FileInputStream("some_file.txt");
            System.out.println("File opened.");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception (FileNotFoundException) handled: " + e.getMessage());
        }
    }
}
