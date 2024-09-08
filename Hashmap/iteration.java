package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("india", 100);
        hm.put("america", 150);
        hm.put("nepal", 50);
        

        Set<String> keys=hm.keySet();
        for(String k:keys){
          System.out.println("key:"+k+",value:"+hm.get(k));
        }
    }
    
}
