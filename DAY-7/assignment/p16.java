import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    int id;
    double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return id + " " + salary;
    }
}

public class p16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        
        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            employees.add(new Employee(id, salary));
        }

        Collections.sort(employees);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
