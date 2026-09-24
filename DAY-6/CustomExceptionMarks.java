import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomExceptionMarks {
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        } else {
            System.out.println("Marks recorded successfully: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        
        try {
            checkMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
