class Vehicle{
    void engine(){
        System.out.println("It is the marclass engine");
    }
}

interface fare{
    default void fareInfo(){
        System.out.println("the fare of the buss is nominal");
    }
}

class maruti extends Vehicle{
    void marutiengine(){
        System.out.println("it is V6 engine");

    }
}

class bus extends Vehicle implements fare{
    void busType(){
        System.out.println("this is the bus type.");
    }
}

public class q8 {
    public static void main(String[] args) {
        maruti obj = new maruti();
        obj.engine();
        obj.marutiengine();

        bus obj1 = new bus();
        obj1.fareInfo();
        obj1.busType();
        obj1.engine();
    }
}
