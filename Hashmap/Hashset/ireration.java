package Hashmap.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class ireration {
    public static void main(String[] args) {
         HashSet<String> city=new HashSet<>();
         city.add("delhi");
         city.add("mumbai");
         
         city.add("noida");
         city.add("bengluru");

        //  Iterator it =city.iterator();
        //  while (it.hasNext()) {
        //     System.out.println(it.next());
        //  }
        for(String cities: city){
            System.out.println(cities);
        }
    }
    
}
