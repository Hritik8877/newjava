package binarysearchtree;

public class bstsearch {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if (root==null) {
            root=new Node(val);
            return root;
        }
        if (root.data>val) {
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }

        return root;
    }
    public static void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static boolean search(Node root,int key){
        if (root==null) {
            return false;
        }
        if (root.data==key) {
            return true;
        }
        if (root.data>key) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root=null;
        //int key=1;
        for(int i=0; i<value.length; i++){
            root=insert(root, value[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root, 1)) {
            System.out.println("found");

        }
        else{
            System.out.println("not found");
        }
    }
    
}
