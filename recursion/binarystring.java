package recursion;

import string.strbuilder;

public class binarystring {
    public static void printbinaystrng(int n,int lastplace,String str){
        if (n==0) {
            System.out.println(str);
            return;
        }

        printbinaystrng(n-1, 0, str+"0");
        if (lastplace==0) {
            printbinaystrng(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n =3;
        printbinaystrng(n, 0, "");
    }
    
}
