package recursion;

public class xpown {
    public static int pow(int x,int n){
        if (n==0) {
            return 1;
            
        }
    //  int x1= pow(x, n-1);
    //  int xn=x*x1;
    //  return xn;
    return x*pow(x, n-1); 
    }
    public static void main(String[] args) {
        int x=2;
        System.out.println(pow(x, 3));
    }
    
}
