package sorting;

public class counting {
    public static void cont(int num[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            largest=Math.max(largest, num[i]);
        }
        int count[] =new int[largest+1];
        for(int i=0; i<num.length; i++){
            count[num[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++){  
            while (count[i]>0) {
                num[j] =i;
                j++;
                count[i]--;
                
            }
        }
    }
    public static void ins(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] +" ");
        }   
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] ={4,1,3,4,5,1,2};
        cont(num);
        ins(num);
        
    }
    
}
