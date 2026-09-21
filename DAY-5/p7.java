class Calculator07 {
    int add(int first, int second) {
        return first + second;
    }

    int add(int first, int second, int third) {
        return first + second + third;
    }

    double add(double first, double second) {
        return first + second;
    }
}

public class p7 {
    public static void main(String[] args) {
        Calculator07 calculator = new Calculator07();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));
        System.out.println(calculator.add(2.5, 3.5));
    }
}
