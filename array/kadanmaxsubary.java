package array;

public class kadanmaxsubary {
    public static void kadan(int n[]){

        int maximumsubarray=Integer.MIN_VALUE;
        int currsubarray=0;
        for(int i=0; i<n.length; i++){
            currsubarray=currsubarray+n[i];
            if(currsubarray<0){
                currsubarray=0;
            }
            maximumsubarray=Math.max(currsubarray, maximumsubarray);
        }
        System.out.println("the max subarray sum : " +maximumsubarray);
    }
    public static void main(String[] args) {
        int n[] ={-2,-3,4,-1,-2,1,5,-3};
        kadan(n);
        
    }
    
}
