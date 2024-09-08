package backtracking;

public class gridways {
    public static int countways(int i,int j,int m,int n){
        if (i==n-1 && j==m-1) {
            return 1;
            
        }
        else if (i==n || j==n) {
            return 0;
            
        }

        int w1=countways(i+1, j, m, n);
        int w2=countways(i, j+1, m, n);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println(countways(0, 0, m, n));

    }

    
}
