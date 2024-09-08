package prorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(2);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
    
}
