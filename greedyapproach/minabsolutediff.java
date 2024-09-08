package greedyapproach;

import java.util.Arrays;

public class minabsolutediff {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,1,3};

        Arrays.sort(a);
        Arrays.sort(b);
        int minabsoutediffernce=0;
        for(int i=0; i<a.length; i++){
            minabsoutediffernce +=Math.abs(a[i]-b[i]);

        }
        System.out.println("min absolute difference : "+minabsoutediffernce);
    }
    
}
