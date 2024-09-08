package array;
public class EquilibriumPoint {
    public static int findEquilibriumPoint(int[] arr) {
        int totalSum = 0;
       
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
       
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; 
           
            if (leftSum == totalSum) {
                return i + 1; 
            }

            leftSum += arr[i];
        }

        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int result = findEquilibriumPoint(arr);
        if (result != -1) {
            System.out.println("The first equilibrium point is at index: " + result);
        } else {
            System.out.println("No equilibrium point found.");
        }
    }
}
