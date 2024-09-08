package linkedlist;

public class findremoven {
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
       public void deletenthfromend(int n){
        int size=0;
        node temp=head;
        while (temp !=null) {
            temp=temp.next;
            size++;
        }
         
        if(n==size){
            head =head.next;
           return;
        }
        //size-n
        int i=1;
        int itofind =size-n;
        node prev =head;
        while (i<itofind) {
            prev=prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
       }
     
    public static void main(String[] args) {
        findremoven ll=new findremoven();
        
        ll.addfirst(2);
        
        ll.addfirst(1);
        
        ll.addlast(3);
        
        ll.addlast(4);

        ll.print();
        ll.deletenthfromend(2);
        ll.print();

        
        

        
       
        
    }
    
}
