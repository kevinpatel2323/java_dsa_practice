import java.lang.reflect.Array;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class BfsAndDfs {

    static class Edge{
            int src;
            int dest;
            int wt;

            Edge(int src,int dest,int wt){
                this.src = src;
                this.dest = dest;
                this.wt = wt;
            }
        }

    public void addEdge(int src,int dest,int wt){
        
    }
    @SuppressWarnings("unchecked")
    static class Graph{
        
        int size;
        ArrayList<Edge>[] graph;

        Graph (int size){
            this.size = size;
            this.graph = new ArrayList[size];
            
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
        }

        public void add(int src,int dest,int wt){
                this.graph[src].add(new Edge(src, dest, wt));
        }

        public void printBFS(){
            Queue<Integer> q = new LinkedList<>();
            boolean visited[] = new boolean[graph.length];
            
            q.add(this.graph[0].get(0).src);
            
            while (!q.isEmpty()) {
                int curr = q.remove();

                if (!visited[curr]) {
                    System.out.print(curr+" ");
                    visited[curr] = true;
                    for (int i = 0; i < graph[curr].size(); i++) {
                        q.add(this.graph[curr].get(i).dest);
                    }
                }
            }
        }

        public void printDFS(int curr,boolean visited[]){
            System.out.print(curr+" ");
            visited[curr] = true;

            for (int i = 0; i < this.graph[curr].size(); i++) {
                if (!visited[this.graph[curr].get(i).dest]) {
                    printDFS(this.graph[curr].get(i).dest,visited);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.add(0,1,5);

        g.add(1,0,5);
        g.add(1,2,1);
        g.add(1,3,3);

        g.add(2,3,1);
        g.add(2,1,1);
        g.add(2,4,2);

        g.add(3,2,3);
        g.add(3,1,1);

        g.add(4,2,2);


        g.printBFS();
        System.out.println();
        g.printDFS(0,new boolean[5]);
    }
}
