import java.util.PriorityQueue;

public class kNearestCars {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int d;
        int id;

        public Point(int x,int y,int id){
            this.x = x;
            this.y = y;
            this.id = id;
            this.d = this.x*this.x +this.y*this.y;
        }

        @Override
        public int compareTo(Point p2){
            return this.d- p2.d;
        }

    }
    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < pts.length; i++) {
            pq.add(new Point(pts[i][0], pts[i][1],i));
        }

        for (int j = 0; j < k; j++) {
            System.out.println(pq.remove().id);
        }
    }
}
