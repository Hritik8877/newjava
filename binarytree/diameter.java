package binarytree;

//not fully understand

public class diameter {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int heighttree(Node root){
        if (root==null) {
            return 0;
        }
        int lh=heighttree(root.left);
        int rh=heighttree(root.right);
        int height=Math.max(lh, rh) +1;

        return height;

    }
    public static int diam(Node root){
        if (root==null) {
            return 0;
        }
        int leftdiameter=diam(root.left);
        int leftht=heighttree(root.left);
        int rightdiameter=diam(root.right);
        int rightht=heighttree(root.right);

        int selfdiam =leftht+rightht+1;

        return Math.max(selfdiam, Math.max(rightdiameter, leftdiameter));
        

    }
    public static void main(String[] args) {

        Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);

         System.out.println(diam(root));
        
    }
    
}
