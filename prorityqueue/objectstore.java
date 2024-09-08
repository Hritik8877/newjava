package prorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class objectstore {
    static class student implements Comparable<student>{
        String name;
        int rank;
        public student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(student s2) {
           return this.rank -s2.rank;
        }
        
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq=new PriorityQueue<>();
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new student("A", 10));
        pq.add(new student("B", 5));
        pq.add(new student("C", 2));
        pq.add(new student("D", 11));
        pq.add(new student("E", 1)); 

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+ "->"+pq.peek().rank);
            pq.remove();
        }
    }
    
}
