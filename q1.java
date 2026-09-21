class superman{ //SUPER CLASS

    int calculation(int a, int b){ //METHOD ONE
        return a+ b;
        }

    int calculation( int a, int b, int c){ // METHOD 2
        return a+ b + c;
    }

    double calculation( double a, double b, double c){ // METHOD 3
        return a *b;
    }
    
    }

    class child extends superman{
        @Override 
        int calculation(int a, int b){
            return a-b;
        }}

public class q1 {
    public static void main(String[] args) {
        superman obj = new superman();
        System.out.println(obj.calculation(34, 450));
        System.out.println(obj.calculation(88.9,67.5,90.3));   
    }
    
}