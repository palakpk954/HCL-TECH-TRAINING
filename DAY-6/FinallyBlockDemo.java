public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Result is: " + a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed regardless of exception.");
        }
        //hello can nerve ne the hello in the life and that vcan
    }
}
