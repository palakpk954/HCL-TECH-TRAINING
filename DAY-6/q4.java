
import java.io.FileOutputStream;
import java.io.IOException;

public class q4 {
    static void main() {
        try {
            FileOutputStream output = new FileOutputStream
                    ("C:\\filename.txt");

            output.write("Hello".getBytes());
            output.close();
            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
