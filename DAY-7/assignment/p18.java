import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee18 {
    int id;
    double salary;

    public Employee18(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + salary;
    }
}

public class p18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee18> employees = new ArrayList<>();
        
        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            employees.add(new Employee18(id, salary));
        }

        Collections.sort(employees, Comparator.comparingDouble((Employee18 e) -> e.salary).reversed());

        for (Employee18 emp : employees) {
            System.out.println(emp);
        }
    }
}
