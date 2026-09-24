public class Test<T, U> {

    // Two variables of generic types T and U
    private T firstVariable;
    private U secondVariable;

    // Constructor to initialize the variables and print them
    public Test(T firstVariable, U secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        
        System.out.println(
                "First Variable: " + firstVariable + " (Type: " + firstVariable.getClass().getSimpleName() + ")");
        System.out.println(
                "Second Variable: " + secondVariable + " (Type: " + secondVariable.getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) {
        // Creating an object of Test using the diamond operator <>
        // Passing an Integer and a String
        Test<Integer, String> testObj1 = new Test<>(101, "Java Generics");

        System.out.println("--------------------");

        // Passing a String and a Double
        Test<String, Double> testObj2 = new Test<>("Price", 99.99);
    }
}
