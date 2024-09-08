public class invertedpyramid {
    public static void ipry(int r){
        for(int i=1; i<=r; i++){
            //for space
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }



//print inverted pyramid number instead of star
public static void pr(int n){
    for(int i=1; i<=n; i++){
      for(int j =1; j<=n-i+1; j++){
        System.out.print(j);
      }
      System.out.println();
    }
}



    public static void main(String[] args) {
      //  ipry(4 );
      pr(4);
        
    }
    
}
