package function;

import java.util.Scanner;

public class fnparameter {
    public static int add(int a,int b){
        int sum =a*b;
       // System.out.println("the addition of two number is : " +sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a =sc.nextInt();
        System.out.println("enteer the number");
        int b =sc.nextInt();
        //add(a, b);
         int sum =add(a, b);
         System.out.println("the product of num : " +sum);
        
        //swapping of value of two variable 
        // int p=2;
        // int q= 5;

        // int temp =p;
        // p=q;
        // q=temp;
        // System.out.println("p = "+p +" " +"q = " +q);
    }
    
}
