package linkedlist;

public class removecycle {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    
    
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
     
    public static void main(String[] args) {
        head =new node(1);
        node temp=new node(2);
        head.next=temp;
        head.next.next=new node(3);
        head.next.next.next=temp;

        
        System.out.println(cycle());
        removcycle();
        System.out.println(cycle());
     
        

        
        

        
       
        
    }
    
}
