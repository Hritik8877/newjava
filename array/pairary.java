package array;

public class pairary {
    public static void pair(int n[]){
        int totalpair =0;
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                System.out.print("("+n[i] +"," +n[j] +")" +" "); 
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("the total pair is :"+totalpair);

    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        pair(n);
       
    }
    
}
