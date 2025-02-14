package binarysearchtree;

public class validbst {
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
    public static boolean isvalid(Node root, Node min,Node max){
        if (root==null) {
            return true   ;
        }
        if (min !=null && root.data <=min.data) {
            return false;
        }
        if (max !=null && root.data >=max.data) {
            return false;
        }

        return isvalid(root.left, min, root)&&isvalid(root.right, root, max);

    }
    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<value.length; i++){
            root=insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
       if (isvalid(root, null, null)) {
        System.out.println("valid");
       }else{
        System.out.println("not valid");
       }
    }
    
}
