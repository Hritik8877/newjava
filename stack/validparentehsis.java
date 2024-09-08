package stack;

import java.util.Stack;

public class validparentehsis {
    public static boolean isvalid(String str){
        Stack<Integer> s=new Stack<>();

        for(int i=0; i<str.length(); i++){
        char ch=str.charAt(i);

        //opening
        if (ch=='(' ||ch=='{' ||ch=='[') {
            s.push((int) ch);
        }else{
            //closing
           if (s.isEmpty()) {
            return false;
           }
           if (s.peek()=='(' && ch==')'  || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']') {
            s.pop();
           }else{
            return false;
           }
        }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="({})[]";//true

        System.out.println(isvalid(str));
    }
    
}
