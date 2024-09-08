package loops;

public class pattriangle {
    public static void trg(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1" +" ");
                }
                else{
                    System.out.print("0" +" ");
                }
            }
            System.out.println();
        }
    }

    public static void trig(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                
                    System.out.print("*" +" ");
                
                
                   
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        trg(5);
        trig(5);
        
    }
    
}
