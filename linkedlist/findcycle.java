package linkedlist;

public class findcycle {
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

       public static boolean cycle(){
       node slow =head;
       node fast =head;

       while (fast !=null && fast.next !=null) {
         slow=slow.next;
         fast=fast.next.next;
         if (slow==fast) {
            return true;
         }
       }
       return false;
       }
     
    public static void main(String[] args) {
        head =new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
    
        node temp =head.next;
        head.next.next.next=temp;
        System.out.println(cycle());
        

        
        

        
       
        
    }
    
}
