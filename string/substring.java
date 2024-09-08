package string;

public class substring {
    public static String substr(String str,int si,int ei){
        String sub="";
        for(int i=si; i<ei; i++){
            sub += str.charAt(i);
        }
        return  sub;

    }
    public static void main(String[] args) {
        String str="helloworld";

        // java has inbuilt function for substring 
        System.out.println(str.substring(0,5));

       // System.out.println(substr(str, 0, 5));
    }
    
}
