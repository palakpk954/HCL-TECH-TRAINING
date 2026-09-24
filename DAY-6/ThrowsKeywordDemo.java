import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordDemo {
    static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        System.out.println("File opened successfully.");
    }

    public static void main(String[] args) {
        try {
            readFile("testfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException handled in the calling method: " + e.getMessage());
        }
    }
}
