package array;

public class sorted {
    public static boolean check(int[] nums) {
        for(int i=1; i<nums.length; i++){
            if(nums[i]<=nums[i-1]){
               
            }else{
                 return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int nums[]={3,4,5,1,2};
        System.out.println(check(nums));
        
    }
    
}
