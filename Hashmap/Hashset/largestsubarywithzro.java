package Hashmap.Hashset;

import java.util.HashMap;

public class largestsubarywithzro {
    public static void larsubzro(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0; 
        int len=0;
        map.put(0, -1);
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            if (map.containsKey(sum)) {
                len=Math.max(len, i-map.get(sum));

            }else{
                map.put(sum, i);
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args) { 
        int arr[]={15,-2,2,-8,1,7,10,23};
        larsubzro(arr);

      
    }
    
}
