package linkedlist;

public class mergesortll {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;public static node tail;
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
      

       public static void removcycle(){
       node slow =head;
       node fast =head;
       boolean cycle=false;

       while (fast !=null && fast.next !=null) {
         slow=slow.next;
         fast=fast.next.next;
         if (slow==fast) {
            cycle =true;
            break;
         }
       }
       if ( cycle==false) {
        return;
       }
       slow=head;
       node prev =null;
       while (slow !=fast) {
        prev =fast;
        slow =slow.next;
        fast=fast.next;
       }
       prev.next=null;
    

       }
       public node getmid(node head){
            node slow=head;
            node fast=head.next;
            while (fast !=null && fast.next !=null) {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
       }
       public node merge(node head1,node head2){
        node mergell=new node(-1);
        node temp=mergell;
        while (head1 !=null && head2!=null) {
            if (head1.data <=head2.data) {
                temp.next=head1.next;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1 !=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2 !=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergell.next;
       }



       public  node mergesort(node head ){
        if(head==null || head.next==null){
         return head;
        }
        node mid= getmid(head);
        node righthead =mid.next;
        mid.next=null;
        node newleft=  mergesort(head);
        node newright=  mergesort(righthead);

        //merge
        return merge(newleft,newright);

       }
     
    public static void main(String[] args) {
        mergesortll ll=new mergesortll();

     ll.addfirst(1);
     ll.addfirst(2);
     ll.addfirst(3);
     ll.addfirst(4);
    // ll.addfirst(5);
     ll.print();
     
        ll.head=ll.mergesort(ll.head);
        ll.print();

        
        

        
       
        
    }
    
}
