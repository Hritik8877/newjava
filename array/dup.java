package array;
public class dup {
    public static int duplicate(int arr[],int length){
        if (length==0|| length==1) {
            return length;
        }
        int j=0;
        for(int i=0; i<length-1; i++){
            if (arr[i] !=arr[i+1]) {
                arr[j]=arr[i];
                j++;
                
            }

        }
        arr[j++]=arr[length-1];
          return j;
    }

    public static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1; j<arr.length; j++){
        if(arr[i] !=arr[j]){
        arr[i+1]=arr[j];
        i++;
        }
    }
    return i+1;
   } 

    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        int newlength=duplicate(arr,length);

        System.out.println(newlength);

        for(int i=0; i<newlength; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
