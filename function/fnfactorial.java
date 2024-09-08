package function;

import java.util.Scanner;

public class fnfactorial {
    public static int fact(int n){
       // int count =0;
       int a=1;
        for(int i=1; i<=n; i++){
            a=a*i;
        }
       // System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Entere the number: ");
       int n=sc.nextInt();
        
        System.out.println(fact(n));
       
    }
    
}
