public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        // Unchecked exceptions are not checked at compile-time, they occur at runtime
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception (ArithmeticException) handled: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception (NullPointerException) handled: " + e.getMessage());
        }
    }
}
