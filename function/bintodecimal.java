package function;

public class bintodecimal {
    public static void bindec(int binnum){
        int mynum = binnum;
        int pow =0;
        int decimal =0;
        while (binnum>0) {
            int lastdigit = binnum%10;
            decimal =decimal +(lastdigit* (int) Math.pow(2, pow));
            pow++;
            binnum =binnum/10;
            
            
            
        }
        System.out.println("the decimal of " +mynum  +" :" +decimal);
    }
    public static void main(String[] args) {
        bindec(101);
        
    }
    
}
