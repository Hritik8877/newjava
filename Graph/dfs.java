package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class dfs {
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
    public static void creategraph(ArrayList<Edge> [] graph){
        for(int i=0; i<graph.length; i++){
           graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[5].add(new Edge(6, 5, 1));
    }
    public static void df(ArrayList<Edge> graph[],int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]) {
                df(graph, e.dest, vis);
            }
        }
       
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creategraph(graph);
        df(graph, 0, new boolean[v]);

        
    }
    
}
