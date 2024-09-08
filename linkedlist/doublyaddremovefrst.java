package linkedlist;

public class doublyaddremovefrst {
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


    //removefirst
    public int removefirst(){
        if (head==null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE; 
        }

        if (size==1) {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }


    public static void main(String[] args) {
        doublyaddremovefrst dll =new doublyaddremovefrst();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print();
        System.out.println(dll.size);

        dll.removefirst();
        dll.print();
        System.out.println(dll.size);
    }
    
}
