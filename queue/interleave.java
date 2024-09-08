package queue;
import java.util.*;
import java.util.Queue;
public class interleave {
    public static void interl(Queue<Integer> q){
        Queue<Integer> frsthalf=new LinkedList<>();
        int size=q.size();
        for(int i=0; i<size/2; i++){
            frsthalf.add(q.remove());
        }
        while (!frsthalf.isEmpty()) {
            q.add(frsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interl(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
    
}
