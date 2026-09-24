public class q8<T, U> {

    private T firstVariable;
    private U secondVariable;

    public q8(T firstVariable, U secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        System.out.println(
                "First Variable: " + firstVariable + " (Type: " + firstVariable.getClass().getSimpleName() + ")");
        System.out.println(
                "Second Variable: " + secondVariable + " (Type: " + secondVariable.getClass().getSimpleName() + ")");
    }
    public static void main(String[] args) {
        Test<Integer, String> testObj1 = new Test<>(101, "Java Generics");
        System.out.println("--------------------");
        Test<String, Double> testObj2 = new Test<>("Price", 99.99);
    }
}