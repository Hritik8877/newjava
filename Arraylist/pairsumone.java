package Arraylist;
import java.util.ArrayList;

public class pairsumone {
    // public static boolean pair(ArrayList<Integer> list,int target){
    //   for(int i=0; i<list.size(); i++){
    //     for(int j=i+1; i<list.size(); j++){
    //         if (target==list.get(i)+list.get(j)) {
    //             System.out.println(i +","+j); 
    //        return true;
                
    //         }
    //     }
    // }
    // return false;
    // }
          
    //2 pointer apporach
    public static boolean pair(ArrayList<Integer> list ,int target){
        int lp=0;
        int rp= list.size()-1;
        while (lp<rp) {
            if (list.get(lp)+list.get(rp)==target) {
                System.out.println(lp+","+rp);
                return true;
            }
            
            if (list.get(lp)+list.get(rp)<target) {
                lp++;

                
            }
            else{
                rp--;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target =5;
       System.out.println(pair(list, target));

    }
    
}
