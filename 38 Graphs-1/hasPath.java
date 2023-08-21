import java.lang.reflect.Array;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.management.Query;

public class hasPath{

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

        public boolean HasPath(int src,int dest,boolean visited[]){
            if (src==dest) {
                return true;
            }
            visited[src] = true;
            for (int i = 0; i < this.graph[src].size(); i++) {
                if (!visited[this.graph[src].get(i).dest]&&HasPath(this.graph[src].get(i).dest, dest, visited)) {
                    return true;
                }
            }

            return false;
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


       
        System.out.println(g.HasPath(0,4,new boolean[5]));
    }
}

