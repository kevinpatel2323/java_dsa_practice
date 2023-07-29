import java.util.PriorityQueue;

public class kWeakestSoldiers {
    static class Group implements Comparable<Group>{
       int soldiers;
       int idx;

       public Group(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;
       }

       @Override
       public int compareTo(Group g2){
            if (this.soldiers == g2.soldiers) {
                return this.idx - g2.idx;
            }
            else{
                return this.soldiers-g2.soldiers;
            }
       }
        
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},
                       {1,1,1,1},
                       {1,1,0,0},
                       {1,0,0,0}
                    };

        int k = 2;

        PriorityQueue<Group> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            int soldiers_count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                soldiers_count += arr[i][j] == 1?1:0;
            }
            pq.add(new Group(soldiers_count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println(pq.remove().idx);
        }

    }
}
