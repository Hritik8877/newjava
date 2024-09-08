package Hashmap.Hashset;

import java.util.HashMap;

public class subarraysumk {
    public static void subsum(int arr[], int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;
        map.put(0, 1);

        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
            if (map.containsKey(sum-k)) {
               ans +=map.get(sum-k);
                
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        subsum(arr, k);

       
    }
    
}
