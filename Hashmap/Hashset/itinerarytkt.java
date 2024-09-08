package Hashmap.Hashset;

import java.util.HashMap;

public class itinerarytkt {
    public static String getfirst(HashMap<String,String> ticket){
        HashMap<String,String> revmap=new HashMap<>();
        for(String key: ticket.keySet()){
            revmap.put(ticket.get(key), key);

        }
        for(String key: ticket.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        
        HashMap<String,String> ticket=new HashMap<>();

        ticket.put("chennai", "bengaluru");
        ticket.put("mumbai", "delhi");
        ticket.put("goa", "chennai");
        ticket.put("delhi", "goa");

        String start=getfirst(ticket);
        System.out.print(start);
        for(String key: ticket.keySet()){
            System.out.print("->"+ticket.get(start));
            start=ticket.get(start);
        }
        System.out.println();
        
    }
    
}
