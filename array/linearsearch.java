package array;

public class linearsearch {
    public static int linear(int num[],int key){
        for(int i=0; i<=num.length; i++){
            if(num[i]==key){
                return i;
            }
           
             }
             return -1;
             
    }
   public static void main(String[] args) {
    int [] num ={1,5,10,15,43,14};
    int key =10;
    int index = linear(num,key);
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("key is at index :" +index);
    }
   }
    
}
