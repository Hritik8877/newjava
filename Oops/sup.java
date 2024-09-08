package Oops;

public class sup {
    public static void main(String[] args) {
        horse h=new horse();

    }
    
}

class Animal{
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class horse extends Animal{
    horse(){
        super();
        System.out.println("horse constructor is called");
    }
}