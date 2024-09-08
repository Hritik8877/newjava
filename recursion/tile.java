package recursion;

public class tile {
    public static   int tiling(int n){
        if (n==0||n==1) {
            return 1;
            
        }


        // int vertical = tiling(n-1);

        // int horiz =tiling(n-2);

        // int total = vertical+horiz;
        // return total;
        return tiling(n-1) +tiling(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
    
}
 