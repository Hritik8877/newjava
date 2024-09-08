package greedyapproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class jobsequrncing {
    static class job{
        int deadline;
        int profit;
        int id; //this mean job perform
        public job(int i,int d,int p){
             deadline=d;
             profit=p;
             id=i;
        }

    }
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        
        ArrayList<job> jobs=new ArrayList<>();

        for(int i=0; i<jobinfo.length; i++){
            jobs.add(new job(i, jobinfo[i][0],jobinfo[i][1] ));
        }
          
        Collections.sort(jobs, (obj1,obj2)->obj2.profit-obj1.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        int max=0;
        for(int i=0; i<jobinfo.length; i++){
            job curr=jobs.get(i);
           
            if (curr.deadline>time) {
                seq.add(curr.id);
                max +=curr.profit;
                time++;
                seq.add(curr.profit);
            }
            
            
        }
        System.out.println("max profit : "+max);
        System.out.println("max job performed : "+seq.size());

        for(int i=0; i<seq.size(); i++){
            
            System.out.print(seq.get(i) +" ");
        }
        System.out.println();

        
    }
    
}
