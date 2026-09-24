import java.io.IOException;

public class ThrowVsThrows {
    // throws is used in method signature to declare an exception
    static void checkEligibility(int age) throws IOException {
        if (age < 18) {
            // throw is used to explicitly throw an exception object
            throw new IOException("Not eligible to vote (Age is below 18).");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(15);
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
