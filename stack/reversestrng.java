package stack;
import java.util.*;

public class reversestrng {
    public static String reversestring(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder();
        while (!s.isEmpty()) {
            char curr=s.pop();
            result.append(curr);

        }
       return result.toString();
    }
    //using array

        public static String rverseString(String str) {
            char[] arr = new char[str.length()];
            int idx = 0;
    
            // Push characters to array
            while (idx < str.length()) {
                arr[idx] = str.charAt(idx);
                idx++;
            }
    
            StringBuilder result = new StringBuilder();
            
            // Pop characters from array in reverse order
            for (int i = arr.length - 1; i >= 0; i--) {
                result.append(arr[i]);
            }
    
            return result.toString();
        }
    
    public static void main(String[] args) {
        String str="abc";
     // System.out.println(reversestring(str));
     System.out.println(rverseString(str));
    }
    
}
