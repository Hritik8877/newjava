package linkedlist;

public class zigzaglink{
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public void addfirst(int data){
        //create new node
        node newnode =new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }

        //newnode next=head
        newnode.next=head;

        //head =newnode
        head=newnode;


    }
    public void addlast(int data){
        node newnode=new node(data);
        if (head==null) {
            head=tail=newnode;
            return;
            
        }
        tail.next=newnode;
        tail=newnode;
    }
       public void print(){
        if (head==null) {
            System.out.println("linked list is empty");
            return;
        }
        node temp=head;
        while (temp !=null) {

            System.out.print(temp.data+"->");
            temp =temp.next;
            
        }
        System.out.println("null");

       }
       public void zigzag(){
        node slow =head;
        node fast =head.next;
        while (fast !=null && fast.next !=null) {
            slow =slow.next;
            fast=fast.next.next;
        }
        node mid =slow;

        //reverse 2nd half
        node curr=mid.next;
        mid.next=null;
        node prev=null;
        node next;
        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node left=head;
        node right=prev;
        node nextl,nextr;

        //alt merge - zig zag merge
        while (left !=null && right !=null) {
            nextl =left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;
        }
       }
     
    public static void main(String[] args) {
        zigzaglink ll=new zigzaglink();
        
        ll.addlast(1);
        
        ll.addlast(2);
        
        ll.addlast(3);
        
        ll.addlast(4);
        ll.addlast(5);

        ll.print();
        ll.zigzag();
        ll.print();;

        
        

        
       
        
    }
    
}
