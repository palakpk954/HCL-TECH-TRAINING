import java.util.HashMap;
import java.util.Map;
import java.util.*;



public class q6 {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeMap = new HashMap<>();

        
        employeeMap.put(101, "Palak");
        employeeMap.put(102, "Ram");
        employeeMap.put(103, "Charu");
        employeeMap.put(104, "Dav");

    
        System.out.println("HashMap Elements: " + employeeMap);

        
        String employee102 = employeeMap.get(102);
        System.out.println("Employee with ID 102: " + employee102);
    

   
        employeeMap.put(103, "Charlie Smith");
        System.out.println("After updating ID 103: " + employeeMap);

        
        System.out.println("Contains ID 105? " + employeeMap.containsKey(105));
        System.out.println("Contains value 'Alice'? " + employeeMap.containsValue("Alice"));

        
        employeeMap.remove(104);
        System.out.println("After removing ID 104: " + employeeMap);

        
        System.out.println("\nIterating over the HashMap:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
