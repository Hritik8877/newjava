package string;

public class path {
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if (dir=='N') {
                y++;
                
            }
            else if (dir=='W') {
                x--;
            }
            else{
                x++;
            }
        }
          int  X2=x * x;
             int  Y2=y * y;
        return  (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path="NS";
        //System.out.println(getshortestpath(path));

          String s1="tony";
          String s2=new  String("tony");
          if (s1.equals(s2)) {
            System.out.println("string ar equal");
            
          }
          else{
            System.out.println("string ar  not equal");
          }

    }
    
}
