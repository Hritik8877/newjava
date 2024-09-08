package Oops;

public class inherit {
    public static void main(String[] args) {
    //    fish shark =new fish();
    //    shark.eat();
    //    shark.swim();
    dog dob =new dog();
    dob.eat();
    dob.leg=4;
    System.out.println(dob.leg);


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
    int leg;
}
class dog extends mammels{
    String breed;

}

//derived class
// class fish extends Animal{
//     int fins;
//     void swim(){
//        System.out.println("swim in water");
//     }
// }
