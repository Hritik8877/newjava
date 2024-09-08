package sorting;
import java.util.Arrays;


public class inbulitsort {
    public static void ins(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int num[]={5,3,2,4,1};
        //Arrays.sort(num);  //this line used for entire element sorting
        Arrays.sort(num,0,4);//this line is used for limit sorting which last index you want sort
        ins(num);
        
    }
    
}
