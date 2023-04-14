import java.util.Stack;

public class revStrStack {
    public static StringBuilder revStr(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder t = new StringBuilder();

        int i = 0;
        while (str.length() != i) {
            s.push(str.charAt(i));
            i++;
        }

        while (s.empty() != true) {
            t.append(s.pop());
        }

        return t;
    }
    public static void main(String[] args) {
        String x = "abcdefg";

        System.out.println(revStr(x));

    }
}
