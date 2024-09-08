package linkedlist;

public class checkpalimdrome {
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
         //slow fast approach
         public node findmid(node head){
        node slow=head;
        node fast=head;
        while (fast !=null && fast.next !=null) {
            slow =slow.next;
            fast=fast.next.next;
            
        }
        return  slow; //slow is mid node
         }

       public boolean checkpalimdrom(){
        if (head==null||head.next ==null) {
            return true;
            
        }
       
        //find mid
        node midnode =findmid(head);
        //step2- check reverse half
        node prev=null;
        node curr =midnode;
        node next;
        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left =head;
        //step3- check left and right half
        while (right !=null) {
            if (left.data !=right.data) {
                return false;
            }
            left =left.next;
            right=right.next;
        }
        return true;
       }
     
    public static void main(String[] args) {
        checkpalimdrome ll=new checkpalimdrome();
        
        ll.addlast(1);
        
        ll.addlast(2);
        
        ll.addlast(2);
        
        ll.addlast(1);

        ll.print();
        System.out.println(ll.checkpalimdrom());
        

        
        

        
       
        
    }
    
}
