package Oops;

public class stati {
    public static void main(String[] args) {
        student s1=new student();
        s1.Schoolname = "jmv";
        student s2=new student();
        System.out.println(s2.Schoolname);
    }
    
}
class student{
    String name;
    int roll;

    static String Schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }

}