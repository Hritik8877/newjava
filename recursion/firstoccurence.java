package recursion;

public class firstoccurence {
    public static int foc(int arr[],int key,int i){
       if (i==arr.length-1) {
        return -1;
        
       }
        if (arr[i]==key) {
            return i;
            
        }
        return foc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] ={2,3,5,8,6,5,4,2};
        int key=5;
        System.out.println(foc(arr, key, 0));
    }
    
}
