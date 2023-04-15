import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

// Note Google it Queue using JCF for LL and ArrayDeque

public class queueJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque();

        q.add(1);
        q.add(2);
        q.add(3);

        while (q.peek() != 3) {
            System.out.println(q.remove());
        }
    }
}
