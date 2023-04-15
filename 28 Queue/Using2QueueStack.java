import java.util.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Using2QueueStack {

    static class stack2queue{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int n) {
            q1.add(n);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int x,t;
            while (!q1.isEmpty()) {
                x = q1.remove();
                q2.add(x);
            }
            x = q2.remove();
            while (!q2.isEmpty()) {
                t = q2.remove();
                q1.add(t);
            }
            return x;
        }

        public static void prints() {
            if (isEmpty()) {
                System.out.println("Stack empty");
                return;
            }
            System.out.println(q1);
        }
    }
    public static void main(String[] args) {
        stack2queue s = new stack2queue();

        s.push(1);
        s.push(2);
        s.push(3);

        s.prints();;

        s.pop();

        s.prints();

    }
    
}
