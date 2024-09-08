package divideandconquer;

public class merge {
  public static void mergesort(int arr[] ,int si,int ei){
    if (si>=ei) {
        return;
        
    }
    //kaam
    int mid=si+(ei-si)/2;
    mergesort(arr, si, mid);//left
    mergesort(arr, mid+1, ei);//right
    merges(arr, si,mid, ei);
  }
  public static void merges(int arr[] ,int si,int mid,int ei){
      int temp[]=new int[ei-si+1];
      int i=si; //  iterator for left
      int j=mid+1; //itrator fot right part
      int k=0;//iterator for temp
      while (i <=mid && j<=ei) {
        if (arr[i]<arr[j]) {
            temp[k]=arr[i];
            i++;
            
        }else{
            temp[k]=arr[j];
            j++;
        }
        k++;
        
      }
      //for left part
      while (i<=mid) {
        temp[k++]=arr[i++];
        //k++; i++;
        
      }
      while (j<=ei) {
        temp[k++]=arr[j++];
       // k++; j++;
        
      }
    //   for(k=0,i=si; k<temp.length; k++,i++){
    //     arr[i]=temp[k];
    //   }

    //we also write
    for(k=0; k<temp.length; k++){
        arr[si+k] = temp[k];
    }

  }

    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8,1};
        mergesort(arr, 0, arr.length-1);
        printarray(arr);

    }
    
}
