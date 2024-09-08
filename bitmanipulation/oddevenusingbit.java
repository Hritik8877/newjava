package bitmanipulation;


public class oddevenusingbit {
    public static void odd(int n){
        int bit =1;
        if ((n&bit)==0 ){
            System.out.println("the number even");

            
        }
        else{
            System.out.println("the num is odd");
        }
        
    }
    public static void main(String[] args) {
        
        odd(4);
        odd(5);

    }
    
}
