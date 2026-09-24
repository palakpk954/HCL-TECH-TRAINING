import java.util.LinkedHashSet;

public class q4 {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of Strings
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // Adding a duplicate element (will be ignored)
        linkedHashSet.add("Apple");

        // Displaying the LinkedHashSet (Maintains insertion order)
        System.out.println("LinkedHashSet Elements: " + linkedHashSet);

        // Checking if an element exists
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Removing an element
        linkedHashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + linkedHashSet);
        
        // Iterating through the LinkedHashSet
        System.out.println("Iterating over the elements:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }
    }
}
