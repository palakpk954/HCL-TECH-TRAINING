import java.util.Scanner;

public class ThrowCatchDemo {
    static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid marks. Marks must be between 0 and 100.");
        } else {
            System.out.println("Valid marks entered: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();
        
        try {
            validateMarks(marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
