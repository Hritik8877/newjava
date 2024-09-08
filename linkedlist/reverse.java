package linkedlist;

public class reverse {
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

       public void rev(){
        node prev=null;
        node next;
        node curr=tail= head;
       while (curr !=null) {
        next=curr.next;
        curr.next=prev;
        prev= curr;
        curr=next;

        
       }
       head=prev;
       }
     
    public static void main(String[] args) {
        reverse ll=new reverse();
        
        ll.addfirst(2);
    
        ll.addfirst(1);
    
        ll.addlast(3);
    
        ll.addlast(4);

        ll.print();
        ll.rev();
        ll.print();

        
        

        
       
        
    }
    
}
