class Vehicle{
    Vehicle(){
        System.out.println("This is main car factory");

    }
}

class car extends Vehicle{
    car(){
        System.out.println("I have a car");

    }

}

class bus extends Vehicle{
    bus(){
        System.out.println("this is the big bus");
    }
}

public class q6 {
    public static void main(String[] args) {
        new car();
        new bus();

    }  
}

//Write a Java program to implement hierarchical inheritance for different types of animals. Create a parent class Animal and 
//derive Dog and Cat from it. Demonstrate common functionality inherited by both child classes along with their specific behaviors.

