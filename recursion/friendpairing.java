package recursion;

public class friendpairing {
    public static int frdprg(int n){
         if (n==1||n==2) {
          return n;
           }
            
        
        // //choice
        // //single
        // int fnm1=frdprg(n-1);
        // //pair
        // int fnm2=frdprg(n-2);

        // int pairways =(n-1)*fnm2;

        // int totalways =fnm1+pairways;
        // return totalways;  

        return frdprg(n-1) + (n-1)*frdprg(n-2);


    }

    public static void main(String[] args) {
        int n=3;
    System.out.println(frdprg(n));
    }
    
}
