package sorting;

public class insertion {
    public static void  insert(int num[]){
        for(int i=0; i<num.length; i++){
            int curr=num[i];
            int prev=i-1;
            //finding the current position 
            while (prev>=0 && num[prev]>curr) {
                num[prev+1]=num[prev];
                prev--;
                
            }
            //insertion
            num[prev+1]=curr;
        }
    }
    public static void ins(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int num[]= {5,4,2,1,3};
        insert(num);
        ins(num);

    }
    
}
