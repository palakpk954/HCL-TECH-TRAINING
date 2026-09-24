public class q7 {

    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+ "=" + element);
    }

    public static void main(String[] args) {
        genericDisplay(11);

        genericDisplay("HCL STUDENTS");

        genericDisplay(1.0);
}
}

//take input from the user


