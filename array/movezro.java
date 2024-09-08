package array;
public class movezro {
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; 
        
        
        
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                
                
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[current];
                nums[current] = temp;
                
                
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        // Print the result
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 1 3 12 0 0
    }
}
