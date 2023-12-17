 /* Breath in First & Depth in First */


import java.util.*;

public class GraphCode {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) { // if we wanna add weight, then write
            this.src = s; // int weight
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
       /*  graph[0].add(new Edge(0, 1)); // also add weight into those lines
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));*/
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
    }

    // For breath first search(BFS)
    // we'll create a method for it
    public static void bfs(ArrayList<Edge> graph[], int V) {
        // create a queue
        Queue<Integer> q = new LinkedList<>();
        // create visited arr to keep track on neighbours which one is visited or not.
        boolean vis[] = new boolean[V];
        // now add starting point to queue
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;
            }

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }

    // create a method for depth first search
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false)
                dfs(graph, e.dest, vis);
        }
    }

    // Now I gonna to write a code from finding(and printing) all paths from source
    // to target.
    public static void printAllpath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
             return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllpath(graph, vis, e.dest, path + e.dest, tar);
                vis[curr] = false;
            }
        }
    }
     // I gonna write code for is-Cycle is present or not in directed-graph
      public static boolean isCycledirect(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]){
         vis[curr] = true;
         rec[curr] = true;
         
         for(int i=0; i<graph[curr].size(); i++){
             Edge e = graph[curr].get(i);
              // if - for cycle is present or not
               if(rec[e.dest]){
                   return true;
               }else if(!vis[e.dest]) 
               if(isCycledirect(graph, vis, e.dest, rec)){
                 return true;
               }
         }
          rec[curr] = false;
          return false;
      }
    public static void main(String args[]) {
        // int V = 7;
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // bfs(graph, V);
        // for(int i=0; i<graph[2].size();i++){ // this will only print 2's neighbours
        // Edge e = graph[2].get(i); // this will get dest then we'll print it.
        // System.out.print(e.dest+" ");
        // boolean vis[] = new boolean[V];
        // dfs(graph, 0, vis);
        int src = 0, tar = 5;
        //printAllpath(graph, new boolean[V], src, "0", tar);
        System.out.println(isCycledirect(graph, new boolean[V], 0 , new boolean[V]));
    }
}
