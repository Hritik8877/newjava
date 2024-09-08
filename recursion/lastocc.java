package recursion;

public class lastocc {
    public static int loc(int arr[],int key,int i){
       if (i==arr.length) {
        return -1;
        
       }

       int f=  loc(arr, key, i+1);
        if (f==-1&&arr[i]==key) {
            return i;
            
        }  
       return f;
       
    }
    public static void main(String[] args) {
        int arr[] ={2,3,5,8,6,5,4,2};
        int key=2;
        System.out.println(loc(arr, key, 0));
    }
    
}