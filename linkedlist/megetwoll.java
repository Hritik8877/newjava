package linkedlist;



public class megetwoll {
    static class Node {
        int data;
        Node next;        
        Node(int x) {
            data = x;
            next = null;
        }
    }
    public static Node mergeLists(Node a, Node b){
        if(a==null){
            return b;
        }
        if (b==null) {
            return a;
        }
        if (a.data<=b.data) {
            a.next=mergeLists(a.next, b);
            return a;
        }else{
            b.next=mergeLists(a, b.next);
            return b;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        Node res = mergeLists(a, b);

        
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
    }
    
}
