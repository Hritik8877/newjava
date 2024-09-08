package Oops;

public class hrearinherit {
    public static void main(String[] args) {
        fish f=new fish();
        f.swim();
        f.eat();
        f.breadth();
       
    }
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
       void breadth(){
        System.out.println("breadth");
       }
}

class mammels extends Animal{
    void walk(){
        System.out.println("walk");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("bark");
    }

}

class fish extends Animal{
    void swim(){
        System.out.println("swim");
    }

}
