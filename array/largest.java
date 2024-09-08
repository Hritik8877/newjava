package array;
import java.util.Arrays;
import java.util.Scanner ;

public class largest {
    public static int lar(int num[]){
        int larg=Integer.MIN_VALUE;

        for(int i =0; i<num.length; i++){
            if(larg<num[i]){
                larg =num[i];
            }
        }
        return larg;
    }
    public static int secl(int num[]){
        int larg=0;
        int sec=-1;
        for(int i=0; i<num.length; i++){
            if(larg<num[i]){
                sec=larg;
                larg= num[i];
                
            }else if(num[i]<larg && num[i]>sec){
                sec=num[i];
            }
           
        }
         return sec;
    }
    public static void main(String[] args) {
        int num[] ={1,4,6,3,5};
        
        System.out.println("the largst value is :" +lar(num));
        System.out.println(secl(num));
        
        
    }
    
}
