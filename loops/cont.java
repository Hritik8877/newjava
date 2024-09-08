package loops;
import java.util.Scanner;

public class cont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do{
        // System.out.println("Enter the number: ");
        // int n =sc.nextInt();
        //        if(n%10==0){
        //         continue;
        //     }
        //     System.out.println("the num is :"+n);
        // }while(true);


        //keep entering the the number until user enter the multiple of 10
        do{
            System.out.println("Enter the number: ");
            int n =sc.nextInt();
                   if(n%10==0){
                    break;
                }
                System.out.println("the num is :"+n);
            }while(true);
    }
    
}
