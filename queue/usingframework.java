package queue;

import java.util.Queue;
import java.util.LinkedList;

public class usingframework {
    public static void main(String[] args) {
     Queue<Integer> q=new LinkedList<>();

     q.add(1);
     q.add(2);
     q.add(3);

     while (!q.isEmpty()) {
       // q.remove();
        System.out.println(q.remove());
     }
        
    }
    
}
