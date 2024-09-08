package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;




public class flightwithcheapestcost {
        static class Edge{
            int src;
            int dest;
            int wt;
            public Edge(int s,int d,int w){
                this.dest=d;
                this.src=s;
                this.wt=w;
            }
        }
    public static void creategraph(int flight[][],ArrayList<Edge> [] graph){
        for(int i=0; i<graph.length; i++){
           graph[i]=new ArrayList<>();
        }
       for(int i=0; i<flight.length; i++){
        int src=flight[i][0];
        int dest=flight[i][1];
        int wt=flight[i][2];
        Edge e=new Edge(src, dest, wt);
        graph[src].add(e);
       }
        
    }
    static class info{
        int n;
        int cost;
        int stops;
        public info(int n,int cost,int stops){
            this.n=n;
            this.cost=cost;
            this.stops=stops;
        }
        
    }
    public static int flightcheapcost(int n,int flight[][],int src,int dest,int k,ArrayList<Edge> graph[]){
       
        int dist[]=new int[n];
        for(int i=0; i<n; i++){
            if(i !=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        Queue<info> q=new LinkedList<>();
        q.add(new info(src, 0 ,0));
        while (!q.isEmpty()) {
            info curr=q.remove();
            if (curr.stops>k) {
                    break;
            }
            for(int i=0; i<graph[curr.n].size(); i++){
                Edge e=graph[curr.n].get(i);
                int u=e.src;
                int v=e.dest;
                int w=e.wt;
                if ( curr.cost+w<dist[v] && curr.stops<=k) {
                    dist[v]=dist[u]+w;
                    q.add(new info(v, dist[v], curr.stops+1));
                }

            }

            
            
        }
        if (dist[dest]==Integer.MAX_VALUE) {
            return -1;
        }else{
            return dist[dest]; 
        }
    }
   
    public static void main(String[] args) {
        int n=4;
       
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0,dist=3,k=1;
        ArrayList<Edge> graph[] =new ArrayList[n];
        creategraph(flight, graph);
        
       System.out.println( flightcheapcost(n, flight, src, dist, k,graph));
        
        

        
    }
    
}
