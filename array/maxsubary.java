package array;

public class maxsubary {
    public static void psubary(int n[]) {
        int max = Integer.MIN_VALUE; 

        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += n[k];
                }
                System.out.println(sum);
                if (sum > max) { 
                    max = sum;
                }
            }
        }
        System.out.println("Max sum of subarray: " + max);
    }

    public static void main(String[] args) {
        int n[] = {2, 4, 6, 8, 10};
        psubary(n);
    }
}
