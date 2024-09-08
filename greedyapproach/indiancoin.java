package greedyapproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indiancoin {
    public static void main(String[] args) {
        Integer coin[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin,Comparator.reverseOrder());
    
        ArrayList<Integer> ans=new ArrayList<>();
        int count=0;
        int amount=121;

        for(int i=0;i<coin.length; i++){
            if (coin[i]<=amount) {
                while (coin[i]<=amount) {
                    count++;
                    ans.add(coin[i]);
                    amount=amount-coin[i];
                }
            }
        }
        System.out.println(count);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        
    }
    
}
