public class MultipleThrowsDemo {
    static void performOperations() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int result = 10 / 0; // Throws ArithmeticException
        // int[] arr = new int[2]; arr[5] = 10; // Throws ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        try {
            performOperations();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }
}
