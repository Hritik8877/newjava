package trie;

public class searchprefix {
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
    public static boolean strtwithproblem(String prefix){
        Node curr=root;
        for(int i=0; i<prefix.length(); i++){
            int idx=prefix.charAt(i)-'a';
            if (curr.child[idx]==null) {
                return false;
            }
            curr= curr.child[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String word[]={"apple","app","mango","man","women"};
        String prefix="app";
        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }

        System.out.println(strtwithproblem(prefix));
    }
    
}
