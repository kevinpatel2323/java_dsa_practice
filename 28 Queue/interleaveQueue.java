import java.util.LinkedList;
import java.util.Queue;

public class interleaveQueue {

    public static void interleaveQueue(Queue<Integer> q) {
        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 0; i < q.size(); i++) {
            int x = q.remove();
            q1.add(x);
        }

        for (int i = 0; i < q.size(); i++) {
            if (i%2 == 0) {
                q.add(q1.remove());
            }
            else{
                q.add(q.remove());
            }
        }

        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            q.add(i);
        }

        System.out.println(q);

        interleaveQueue(q);
    }
}
