import java.util.TreeSet;

public class q5 {
    public static void main(String[] args) {
        // Creating a TreeSet of Integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);

        // Adding a duplicate element (will be ignored)
        treeSet.add(20);

        // Displaying the TreeSet (Elements are naturally sorted in ascending order)
        System.out.println("TreeSet Elements: " + treeSet);

        // Getting the first (lowest) and last (highest) elements
        System.out.println("First element (lowest): " + treeSet.first());
        System.out.println("Last element (highest): " + treeSet.last());

        // Exploring other subset features of TreeSet
        System.out.println("Elements strictly less than 30: " + treeSet.headSet(30));
        System.out.println("Elements greater than or equal to 30: " + treeSet.tailSet(30));

        // Removing an element
        treeSet.remove(40);
        System.out.println("After removing 40: " + treeSet);

        // Iterating through the TreeSet
        System.out.println("Iterating over the elements:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }
    }
}
