import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {

    public static void revQ(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i <10; i++) {
            q.add(i);
        }
        System.out.println(q);

        revQ(q);
    }
}
