public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int a = 10;
            int b = 0;
            // Uncomment the line below to trigger ArrayIndexOutOfBoundsException
            // System.out.println(numbers[5]); 
            
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index.");
        }
    }
}
