import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Double> salaries = new HashMap<>();
        
        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            salaries.put(id, salary);
        }

        for (Map.Entry<Integer, Double> entry : salaries.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        double totalSalary = 0;
        for (Double salary : salaries.values()) {
            totalSalary += salary;
        }// there are a lot of the the form yje akak kokyjjjkkij kooj koij oaajkala kepp pyje e im 
        System.out.println(totalSalary);

        System.out.print("Enter salary threshold to filter: ");
        double threshold = scanner.nextDouble();
        for (Map.Entry<Integer, Double> entry : salaries.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
