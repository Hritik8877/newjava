package Graph;
import java.util.ArrayList;;

public class detectcycle {

        static class Edge{
            int src;
            int dest;
           // int wt;
            public Edge(int s,int d){
                this.dest=d;
                this.src=s;
             //   this.wt=w;
            }
        }
       
    static void creategraph(ArrayList<Edge> graph[]){
     for(int i=0; i<graph.length; i++){
        graph[i]=new ArrayList<>();

     }
     graph[0].add(new Edge(0, 1));
     graph[0].add(new Edge(0, 2));
     graph[0].add(new Edge(0, 3));

     graph[1].add(new Edge(1, 0));
     graph[1].add(new Edge(1, 2));

     graph[2].add(new Edge(2, 0));
     graph[2].add(new Edge(2, 1));

     graph[3].add(new Edge(3, 0));
     graph[3].add(new Edge(3, 4));

     graph[4].add(new Edge(4, 3));

    }
    public static boolean detectcycle(ArrayList<Edge> graph[]){
        boolean vis[] =new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if (detectcycleutil(graph,vis,i,-1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectcycleutil(ArrayList<Edge> graph[],boolean vis[], int curr,int par){
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if (!vis[e.dest] ) {
                if (detectcycleutil(graph, vis, e.dest, curr)) {
                    
                    return true;
                }
            }
            else if (vis[e.dest] && e.dest !=par) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creategraph(graph);
        System.out.println(detectcycle(graph));
    }
    
}
