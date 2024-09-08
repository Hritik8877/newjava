package recursion;

public class optxpown {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int halfp= power(x, n/2);
      int half=  halfp*halfp;
      if(n%2!=0){
        half =x*half;
      }
      
        return half;
      
        
    }
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(power(x, n));
    }
    
}
