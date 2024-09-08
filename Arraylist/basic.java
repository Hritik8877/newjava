package Arraylist;
import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
         System.out.println(list);
        //  int element = list.get(2);
        //  System.out.println(element);
        //  int el = list.remove(3);
        //  System.out.println(el);
        //  System.out.println(list);
        // int element = list.set(1,10);
        // System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
    }

    
}
