package Hashmap.Hashset;

import java.util.HashSet;

public class distinct {
    public static void Distinct(int arr[]){
        HashSet<Integer> dist=new HashSet<>();
        
       for(int i=0; i<arr.length; i++){
        dist.add(arr[i]);

       }
       System.out.println(dist.size());
    }
    
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        Distinct(arr);
        

    }
    
}
