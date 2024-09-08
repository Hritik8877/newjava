package Oops;

public class basic {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setcolor("blue");
        System.out.println( p1.color);
        p1.settip(5);
        System.out.println(p1.tip);


        bankaccount ac = new bankaccount();
        ac.username ="hrk";
        ac.setpassword("acbd");

        System.out.println(ac.username);
      
         

        
    }
    
}
class pen{
    //properties+function
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
        
    }
    void settip(int newtip){
        tip =newtip;
    }

}


class bankaccount{
  String username;
  private String password;
  

  public void setpassword(String pwd){
    password =pwd;
  }
}
