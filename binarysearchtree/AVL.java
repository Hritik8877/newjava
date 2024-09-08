package binarysearchtree;

public class AVL {
    static class Node{
        int data,height;
        Node left,right;
        Node(int data){
            this.data=data;
            height=1;
        }
    }
    public static Node root;
    public static int Height(Node root){
        if (root==null) {
            return 0;
        }
        return root.height;
    }


    public static int getbalance(Node root){
      if (root==null) {
        return 0;
      }
      return Height(root.left)-Height(root.right);
    }
         
    public static Node leftrotate(Node x){
        Node y=x.right;
        Node t2=y.left;
        //perform rotate
        y.left=x;
        x.right=t2;

        //update height
        x.height=Math.max(Height(x.left),Height(x.right))+1;
        y.height=Math.max(Height(y.left),Height(y.right))+1;
        return y;
    }

    public static Node rightrotate(Node y){
        Node x=y.left;
        Node t2=x.right;

        x.right=y;
        y.left=t2;

        y.height=Math.max(Height(y.left), Height(y.right))+1;
        x.height=Math.max(Height(x.left), Height(x.right))+1;
        return x;
    }

    public static Node insert(Node root,int key){
        if (root==null) {
            return new Node(key);
        }
        if(key<root.data){
            root.left=insert(root.left, key);
        }else if (key>root.data) {
            root.right=insert(root.right, key);
        }else{
            return root;
        }
        root.height=1+Math.max(Height(root.left),Height(root.right) );
        int bf=getbalance(root);
        //left left case

        if (bf>1 && key<root.left.data) {
            return rightrotate(root);
        }
        // right right case
        if (bf<-1 && key>root.right.data) {
            return leftrotate(root);
        }
        //left right case
        if (bf>1 && key>root.left.data) {
            root.left=leftrotate(root.left);
            return rightrotate(root);
        }
        //right left case
        if (bf<-1 && key<root.right.data) {
            root.right=rightrotate(root.right);
            return leftrotate(root);
        }
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,40);
        root=insert(root,50);
        root=insert(root,25);
        
        preorder(root);
    }
    
}
