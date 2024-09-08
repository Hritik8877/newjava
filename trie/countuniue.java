package trie;

public class countuniue {
    static class Node{
        Node child[]=new Node[26];
        boolean eow=false; //eow-end of word
        Node(){
            for(int i=0; i<26; i++){
                child[i]=null;
            }
        }

    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0; level<word.length(); level++){
            int idx=word.charAt(level)  -'a';
            if (curr.child[idx]==null) {
                curr.child[idx]=new Node();
            }
            curr=curr.child[idx];
        }
        curr.eow=true;

    }
    public static boolean search(String key){
        Node curr=root;
        for (int i=0; i<key.length(); i++) {
            int idx=key.charAt(i)-'a';
            if (curr.child[idx]==null) {
                return false;
            }
            curr=curr.child[idx];
        }
        return curr.eow==true;
    }
    public static int countnode(Node root){
        if (root==null) {
            return 0;
        }
        int count=0; 
        for(int i=0; i<26; i++){
            if (root.child[i]!=null) {
                count +=countnode(root.child[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str="ababa";
        for(int i=0; i<str.length(); i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(countnode(root));
    }
    
}
