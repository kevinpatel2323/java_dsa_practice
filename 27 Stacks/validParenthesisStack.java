import java.util.Stack;

public class validParenthesisStack {

    public static boolean vp(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); 
            if (c=='{' || c == '(' || c=='[') {
                s.push(c);
            }
            if (c=='}' || c == ')' || c==']') {
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && c==')' || s.peek() == '[' && c==']' || s.peek() == '{' && c=='}') {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }

        if (!s.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str= "(lko[{}])";

        System.out.println(vp(str));
    }
}
