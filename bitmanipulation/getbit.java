package bitmanipulation;

public class getbit {
    public static int getb(int n ,int i){
        int bitmask= 1<<i;
        if ((n&bitmask)==0) {
            return 0;
            
        } else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getb(10, 2));
        
    }
    
}
