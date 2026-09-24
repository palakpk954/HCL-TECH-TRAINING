public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled: " + e.getMessage());
        } finally {
            System.out.println("Cleanup operations in finally block executed.");
        }
    }
    //hello world is the new coding language and that can always be the mistakes from the 
}
