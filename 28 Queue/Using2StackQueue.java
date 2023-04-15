import java.util.Stack;

public class Using2StackQueue {

    static class queue2stack{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
                return s1.empty() == true && s2.empty() == true ;
        }

        public static void add(int n) {
            s1.add(n);
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int x,t;
            while (!s1.empty()) {
                x = s1.pop();
                s2.push(x);
            }
            x = s2.pop();
            while (!s2.empty()) {
                t = s2.pop();
                s1.push(t);
            }
            return x;
        }

        public static void printQ() {
            if (!isEmpty()) {
                System.out.println(s1);
            }
            else{
                System.out.println("Queue Empty");
            }
        }

    }
    public static void main(String[] args) {
        queue2stack q = new queue2stack();

        q.add(0);
        q.add(1);
        q.add(2);

        q.printQ();

        q.remove();

        q.printQ();

        System.out.println(q.remove());

        System.out.println(q.remove());

        q.printQ();

        System.out.println(q.remove());
    }
}
