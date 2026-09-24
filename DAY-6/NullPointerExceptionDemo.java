public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: String object is null.");
        }
    }
}
