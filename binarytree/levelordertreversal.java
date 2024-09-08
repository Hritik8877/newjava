package binarytree;

import java.util.LinkedList;
import java.util.Queue;



public class levelordertreversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data ){
            this.data=data;
            this.left=null;
            this.right=null;

        }

    }
    static class Binarytree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if (nodes[idx]== -1) {
                return null;

                
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);


            return newnode;
        }
        public static void levelorder(Node root){
            if (root==null) {
                return ;
                
            }
           Queue<Node> q=new LinkedList<>();
           q.add(root);
           q.add(null);

           while (!q.isEmpty()) {
            Node currnode=q.remove();
            if (currnode==null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currnode.data+" ");
                if (currnode.left !=null) {
                    q.add(currnode.left);
                }
                if(currnode.right !=null){
                    q.add(currnode.right);
                }
            }
           }
            
        }
    }
    
    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Binarytree tree=new Binarytree();
        Node root=tree.buildtree(nodes);
       // System.out.println(root.data);
       tree.levelorder(root);
        
    }
    
}
