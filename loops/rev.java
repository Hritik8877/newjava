package loops;

public class rev {
    public static void main(String[] args) {
        int n=85269;
        int count =0;
        for(int i=0; i<=n; i++){
            int rem= n%10;
            count +=rem;
            System.out.print(rem +" ");
            n=n/10;


        }
    }
    
}
