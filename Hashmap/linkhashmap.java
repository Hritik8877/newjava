package Hashmap;

import java.util.LinkedHashMap;

public class linkhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("india", 100);
        lhm.put("china", 120);
        lhm.put("pak", 5);

        System.out.println(lhm);
    }
    
}
