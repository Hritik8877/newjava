package recursion;

public class num {
  //for decreasing order

    // public static void fa(int n){
    //     if (n==1) {
    //         System.out.println(n+" ");
    //         return;
    //     }
    //    System.out.print(n+" ");
    //     fa(n-1);
       

        
        
    // }

   // for increasing order

    public static void fa(int n){
       
        
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        fa(n-1);
        System.out.print(n+" ");
      
        
       

        
        
    }
    public static void main(String[] args) {
        int n=10;
        fa(n);
        
    } 
    
}
