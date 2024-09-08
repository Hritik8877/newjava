package sorting;

public class selection {
    public static void select(int num[]){
        for(int turn=0; turn<num.length-1;turn++){
            int smallest =turn;
            for(int j=turn+1; j<num.length;j++){
                if (num[smallest]>num[j]) {
                    smallest=j;
                    
                }

            }
            int temp=num[smallest];
                    num[smallest]=num[turn];
                    num[turn]=temp;
        }
    }
    public static void arr(int num[]){
        for(int i=0; i<num.length;i++){
            System.out.print(num[i] +" ");
        }
        System.out.println();
    
    }
    
    public static void main(String[] args) {
        int num[]={5,3,2,4,1};
        select(num);
        arr(num);
    }
    
}
