package recursion;

public class nat {
    public static int natural(int n){
        if (n==1) {
            return 1;
            
        }
        int fn=natural(n-1);
        int f= n+fn;
        return f;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(natural(n));
    }

    
}
