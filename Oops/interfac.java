package Oops;

public class interfac {
    public static void main(String[] args) {
        queeen q=new queeen();
        q.moves();
    }
    
} 
interface chessplayer{
    void moves();
}
class queeen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal,(all four dirextion)");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,");
    }
}

class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal by 1 step");
    }
}

