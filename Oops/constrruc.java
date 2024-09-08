package Oops;

public class constrruc {
    public static void main(String[] args) {
        Student s1= new Student();
        // Student s2= new Student("hrk"); 
        // System.out.println(s1.name);
        // Student s3 = new Student(123);

        s1.name="hrk";
        s1.roll=692;
        s1.password ="abcd";

        Student s2 = new Student(s1);
        s2.password="xyz";
        
    }

    
}


class Student{
    String name;
    int roll;
    String password;

    //creating copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll =s1.roll;
    }

    //creatinf constructor 

        Student(){
            System.out.println("constructor is clalled..");
        }

    Student(String name){
        this.name =name;
       // System.out.println();
    }

    Student(int roll){
        this.roll=roll;
    }
}