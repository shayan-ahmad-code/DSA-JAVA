import java.util.ArrayList;
import java.util.*;

public class IsCycleUnDirectedInGraph {
    
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
      for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<Edge>();
      }

      graph[0].add(new Edge(0, 1));
      graph[0].add(new Edge(0, 4));
      graph[1].add(new Edge(1, 2));
      graph[1].add(new Edge(1, 4));
      graph[2].add(new Edge(2, 3));
      graph[4].add(new Edge(4, 0));
      graph[4].add(new Edge(4, 1));
      graph[4].add(new Edge(4, 5));
    }
    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            // neighbours = e.dest
            // applying all three condition which we learn
            if(vis[e.dest] && e.dest != par){
                return true;
            }else if(!vis[e.dest]){
                 if(isCycleUndirected(graph, vis, e.dest, curr)){ // == true
                    return true;
                 }
            }
        }
          return false;
    }
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1)); // -1 is declare parent of 0 because we need to pass parent.


    }
}

 // Output: True (because cycle is present in undirected graph)