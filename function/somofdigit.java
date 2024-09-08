package function;

public class somofdigit {
    public static void main(String[] args) {
        int n =56;
        int digit=0;
        int sum =0;
        while (n>0) {
            int lastdigit =n%10;
             sum += lastdigit;
            n++;
            n = n/10;
            
        }
        System.out.println(sum);

    }
    
}
