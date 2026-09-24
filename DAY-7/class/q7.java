import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> studentScores = new HashMap<>();

        System.out.print("Enter the number of students to add: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Enter student details:");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter student score: ");
            int score = scanner.nextInt();
            scanner.nextLine();
            
            // Using put to add elements dynamically
            //it is taking all the explaes of the given topic and mke the final soce o the kaaa
            studentScores.put(name, score);
        }

        System.out.println("\nHashMap Elements: " + studentScores);

        System.out.println("\nIterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student Name: " + entry.getKey() + ", Score: " + entry.getValue());
        }
        
        scanner.close();
    }
}
