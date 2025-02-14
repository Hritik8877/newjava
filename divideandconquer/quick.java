package divideandconquer;

public class quick {
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[],int si ,int ei){
        if(si>=ei){
            return;
        }
        //pivot last
        int pindx= partition(arr,si,ei);
        quicksort(arr, si, pindx-1);//left
        quicksort(arr, pindx+1, ei);//right
    }
    public static int partition(int arr[],int si,int ei){
         int pivot =arr[ei];
         int i=si-1; // to make place for smaller than pivot
         for(int j=si; j<ei; j++){
            if (arr[j]<=pivot) {
                i++;
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
                
            }
         } 
         i++;
         int temp =pivot;
         arr[ei]=arr[i];
         arr[i]= temp;
         return i;
    }


    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8,1};
        quicksort(arr, 0, arr.length-1);
        printarray(arr);
    }
    
}
