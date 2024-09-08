package linkedlist;

import recursion.sorted;

public class search {
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
       public int search(int key){
        node temp=head;
        int i=0;
          while (temp !=null) {
            if (temp.data==key) {
                return i;
            }
               temp= temp.next;
            i++;
          }
          return -1;
       }

       //using recursion
       public int helper(node head,int key){
        if(head ==null){
            return -1;
        }
        if (head.data==key) {
            return 0;
        }
        int idx=helper(head.next, key);
        if (idx== -1) {
            return -1;
        }
        return idx+1;

       }
       public int recsearch(int key){
             return helper(head,key);
       }

     
    public static void main(String[] args) {
        search ll=new search();
        
        ll.addfirst(2);
        
        ll.addfirst(1);
        
        ll.addlast(3);
        
        ll.addlast(4);

        ll.print();
        // System.out.println(ll.search(3));
        // System.out.println(ll.search(10));

        System.out.println(ll.recsearch(3));
        System.out.println(ll.recsearch(10));
    

        

        
        

        
       
        
    }
    
}
