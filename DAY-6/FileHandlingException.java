import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingException {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("non_existent_file.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: The specified file does not exist.");
        } catch (IOException e) {
            System.out.println("IOException caught.");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
