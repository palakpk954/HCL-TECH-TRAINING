interface Fare17 {
    default void fareInfo() {
        System.out.println("Fare is calculated according to distance");
    }
}

class Bus17 implements Fare17 {
}

public class p17 {
    public static void main(String[] args) {
        new Bus17().fareInfo();
    }
}
