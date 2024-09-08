package string;

import java.util.Scanner;

public class basic {
    public static void printstr(String fullname){
        for(int i=0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i) +" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
    //     char ch[]={'a','b','c','d'};
    //     String str ="abcd";

    //     Scanner sc=new Scanner(System.in);
    //     String name=sc.nextLine();
    //     System.out.println(name);
    String str="tony stark";
    System.out.println(str.length());

    //concatenation
    String firstname="hritik"; 
    String lastname="kumar"; 
    String fullname =firstname + " " +lastname;
    //System.out.println(fullname);
      
    printstr(fullname);

    }
    
}
