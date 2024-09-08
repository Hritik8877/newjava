package trie;

import recursion.string;

public class uniueprefix {
    static class Node{
        Node child[]=new Node[26];
        boolean eow=false; //eow-end of word
        int freq;
      public  Node(){
            for(int i=0; i<26; i++){
                child[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0; i<word.length(); i++){
            int idx=word.charAt(i)-'a';
            if (curr.child[idx]==null) {
                curr.child[idx]=new Node();
            }else{
                curr.child[idx].freq++;
            }
            curr=curr.child[idx];
        }
    }
    public static String unqprefix(String word){
        Node curr=root;
        String prefix="";
        for(int i=0; i<word.length(); i++){
            int idx=word.charAt(i)-'a';
            if (curr.child[idx]==null) {
                return "";
            }
            curr=curr.child[idx];
            prefix +=word.charAt(i);
            if (curr.freq==1) {
                return prefix;
            }
        }
        return "";

    }
    public static void main(String[] args) {
        String word[]={"zebra","dog","duck","dove"};
           for(int i=0; i<word.length; i++){
            insert(word[i]);
           }
           for(int i=0; i<word.length; i++){
            System.out.println("unique prefix  of "+word[i] +"is :"+unqprefix(word[i]));
           }
        
    }
    
}
