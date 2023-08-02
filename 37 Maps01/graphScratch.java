import java.util.ArrayList;

public class graphScratch{
    static class Edge{
        int source;
        int dest;
        int wght;

        Edge(int source,int dest,int wght){
            this.source = source;
            this.dest = dest;
            this.wght = wght;
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[5];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,4,2));

        graph[3].add(new Edge(3,2,3));
        graph[3].add(new Edge(3,1,1));

        graph[4].add(new Edge(4,2,2));

        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.source);
        }
    }
}