package queue;

import java.util.Stack;
import java.util.Queue;

public class queueusingstack {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        //empty
        public static boolean isempty(){
            return s1.isEmpty();
        }
        //add
        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }
        public static int remove(){
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
              return s1.pop();
        }
        public static int peek(){
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
              return s1.peek();
        }
        
    }
    public static void main(String[] args) {
        Queue    q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
         
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
        
        
    }
    
}
