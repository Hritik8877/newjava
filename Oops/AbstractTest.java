package Oops;

public class AbstractTest {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
}

abstract class Animal {
    String color;
    
    Animal() {
        System.out.println("Animal constructor called");
    }
    
    void eat() {
        System.out.println("Animal eat");
    }
    
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    
    void changeColor() {
        color = "dark brown";
    }
    
    void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on two legs");
    }
}
