import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        System.out.print("Enter the number of students to add: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter student details:");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter student score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); 
            
        
            studentScores.put(name, score);
        }

        
        System.out.println("\nTreeMap Elements (Sorted by Key): " + studentScores);

        System.out.println("\nIterating over the TreeMap:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student Name: " + entry.getKey() + ", Score: " + entry.getValue());
        }
        
        
        if (!studentScores.isEmpty()) {
            System.out.println("\nFirst Entry (Smallest Key): " + studentScores.firstEntry());
            System.out.println("Last Entry (Largest Key): " + studentScores.lastEntry());
        }

        scanner.close();
    }
}
