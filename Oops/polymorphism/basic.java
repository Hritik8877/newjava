package Oops.polymorphism;

public class basic {
    public static void main(String[] args) {
        calculator c=new calculator();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum((float)2.2, (float)2.5));
    }
    
}

class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}
