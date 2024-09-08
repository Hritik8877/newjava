package string;

public class palindrome {
    public static boolean pritstr(String name){
        for(int i=0; i<name.length()/2; i++){
            int n=name.length();
            if (name.charAt(i)==(name.charAt(n-i-1))) {
               return true;
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "noon";
        System.out.println(pritstr(name));
    }
    
}
