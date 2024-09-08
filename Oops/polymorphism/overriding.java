package Oops.polymorphism;

public class overriding {
    public static void main(String[] args) {
        dear d= new dear();
        d.eat();
        Animal a=new Animal();
        a.eat();
    }
    
}

class Animal{
    void eat(){
        System.out.println("eat anything");
    }

}
class dear extends Animal{
    void eat(){
        System.out.println("eat grass");
    }

}