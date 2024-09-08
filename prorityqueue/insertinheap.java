package prorityqueue;

import java.util.ArrayList;

public class insertinheap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            //add at last
            arr.add(data);
            int child=arr.size()-1;
            int par=(child-1)/2;

            while (arr.get(child)<arr.get(par)) {
                int temp=arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par,temp );
            }
        }
        public int peek(){
           return arr.get(0);
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left<arr.size()&&arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size()&&arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }

            if(minIdx !=i){
                int temp=arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        public int remove(){
            int data=arr.get(0);

            int temp=arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);

            heapify(0);
            return data;
        }
    }
    public static void main(String[] args) {
        
    }
    
}
