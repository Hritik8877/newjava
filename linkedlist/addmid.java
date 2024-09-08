package linkedlist;

public class addmid {
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

       public void addmidle(int idx,int data){
        if (idx==0) {
            addfirst(data);
            return;
        }
        node newnode =new node(data);
        node temp=head;
        int i =0;
        while (i<idx-1) {
          temp=temp.next;
          i++;  
            
        }
        newnode.next=temp.next;
        temp.next=newnode;


       }
     
    public static void main(String[] args) {
        addmid ll=new addmid();
        ll.print();
        ll.addfirst(2);
        
        ll.addfirst(1);
        
        ll.addlast(3);
        
        ll.addlast(4);
        ll.addmidle(2, 9);

        ll.print();

        
        

        
       
        
    }
    
}
