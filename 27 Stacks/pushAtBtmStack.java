import java.util.Stack;

public class pushAtBtmStack {

    public static void pushAtBottom(Stack<Integer> s,int n) {
        if (s.isEmpty()) {
            s.push(n);
            return;
        }
        int t = s.pop();
        pushAtBottom(s, n);
        s.push(t);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 0);

        System.out.println(s);
    }
}
