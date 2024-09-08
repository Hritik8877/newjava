        package sorting;

        public class buble {
            public static void bub(int num[]){
                for(int turn=0; turn<num.length-1; turn++){
                
                    for(int j=0; j<num.length-1-turn; j++){
                        if(num[j]>num[j+1]){
                            int temp =num[j];
                            num[j]=num[j+1];
                            num[j+1]=temp;
                            
                        }
                    }
                    
                }
            }
            public static void arr(int num []){
                for(int i=0;i<num.length; i++){
                    System.out.print(num[i] +" ");
            }
            System.out.println();
            }
            public static void main(String[] args) {
                int num[] ={4,3,5,1,2};
                bub(num);
                arr(num);
                
            }
            
        }
