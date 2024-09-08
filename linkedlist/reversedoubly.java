package linkedlist;

public class reversedoubly {
    public class  node {
        int data;
        node next;
        node prev;

        public node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static node head;
    public static node tail;
    public static int size;

    //addfirst
    public void addfirst(int data){
        size++;
        node newnode=new node(data);
        if (head==null ) {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    //print
    public void print(){
        node temp=head;
        while (temp !=null) {
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void reverse(){
        node curr=head;
        node prev=null;
        node next;
        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev =curr;
            curr=next;
        }
        head=prev;
    }


    public static void main(String[] args) {
        reversedoubly dll =new reversedoubly();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print();

        dll.reverse();

        dll.print();
        System.out.println(dll.size);

    }
}
