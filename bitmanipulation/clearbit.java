package bitmanipulation;



public class clearbit {




        public static int set(int n ,int i){
            int bitmask =1<<i;
            return n|bitmask;
        }
    public static int clear(int n,int i){
        int bitmask= 1<<i;
        return n & (~bitmask);
    }
    public static int update(int n,int i, int newbit){
        //  n=clear(n, i);
        // int bitmask=newbit<<i;
        // return n|bitmask;
           if (newbit==0) {
            return clear(n, i);
            
           }
           else{
            return set(n, i);
           }

        }
    public static void main(String[] args) {
      //  System.out.println(clear(10, 1));
      System.out.println(update(10, 2,1));
        
    }
    
}
