class Test<T, V>{
    T obj1;
    V obj2;
    Test(T obj1, V obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    void display(){
        System.out.print("Mr." + obj2 + "s");
        System.out.print("Age is " + obj1);
    }
}
public class q10 {
    public static void main(String[] args) {
        Test <Integer, String> testobjTest= new Test <>(15, "Palak");
        testobjTest.display();

        
    }


    
}
