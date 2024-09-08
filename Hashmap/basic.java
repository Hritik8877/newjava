package Hashmap;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        hm.put("india", 100);
        hm.put("america", 150);
        hm.put("nepal", 50);

        System.out.println(hm);

        //get
       System.out.println(hm.get("india"));
       System.out.println(hm.get("indonesia"));

       //contain
       System.out.println(hm.containsKey("india"));
       System.out.println(hm.containsKey("ind"));
       //remove
    //    hm.remove("india");
    //    System.out.println(hm);
       //size
       System.out.println(hm.size());
       //isEmpty
       System.out.println(hm.isEmpty());
 
       hm.clear();
       System.out.println(hm.isEmpty());

    }
    
}
