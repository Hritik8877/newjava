package stack;

import java.util.Stack;

public class histogram {
    public static void maxarea(int arr[]){
        int maxarea=0;
        int nsr[] =new int[arr.length];
        int nsl[] =new int[arr.length];
        //next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i] ) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //next smaller left
         s=new Stack<>();
        for(int i=0;i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i] ) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //current area  width=j-i-1=nsr[i] -nsl[i]
        for(int i=0; i<arr.length; i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int curentarea=height*width;
            maxarea=Math.max(curentarea, maxarea);
        }

        System.out.println("max area in histogram = " +maxarea);



        
    }

    public static void main(String[] args) {
        int arr[] ={6,2,5,4,5,1,6};
        maxarea(arr);

    }
    
}
