package loops;
import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range : ");
        int range =sc.nextInt();
        int n =1;
        while(n<=range){
            System.out.print(n + " ");
            n++;
        }
    }
    
}
