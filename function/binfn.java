package function;

import java.util.Scanner;

public class binfn {
    public static int fact(int n){
       // int count =0;
       int a=1;
        for(int i=1; i<=n; i++){
            a=a*i;
        }
       // System.out.println(a);
        return a;
    }


    public static int bincoff(int n,int r){
        int fact_n =fact(n);
        int fact_r =fact(r);
        int fact_nmr =fact(n-r);

        int bincoff =( fact_n/(fact_r*fact_nmr));

        return bincoff;
    }

    public static void main(String[] args) {
      
        
        System.out.println(bincoff(5, 2));
       
    }
    
}
