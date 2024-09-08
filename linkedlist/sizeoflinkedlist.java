package linkedlist;

public class sizeoflinkedlist {
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
    public static int size;
    public void addfirst(int data){
        size++;
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
        size++;
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
        size++;
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
       public int removefirst(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

            
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            return val;
            
        }
        int val =head.data;
        head =head.next;
        return val;
      }
     
    public static void main(String[] args) {
        sizeoflinkedlist ll=new sizeoflinkedlist();
        ll.print();
        ll.addfirst(2);
        
        ll.addfirst(1);
        
        ll.addlast(3);
        
        ll.addlast(4);
        ll.addmidle(2, 9);

        ll.print();
        System.out.println(ll.size);
        

        
        

        
       
        
    }
    
}
