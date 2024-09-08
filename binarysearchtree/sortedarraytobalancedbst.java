package binarysearchtree;

public class sortedarraytobalancedbst {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
       
        preorder(root.right);
    }
    public static Node balancedbst(int arr[],int st,int end){
        if (st>end) {
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=balancedbst(arr, st, mid-1);
        root.right=balancedbst(arr, mid+1, end);

        return root;
        
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        int st=0;
        int end=arr.length-1;

        Node root=balancedbst(arr, st, end);
        preorder(root);

    }

    
}
