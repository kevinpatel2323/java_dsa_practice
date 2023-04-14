import java.util.*;

public class duplicateParenthesisStack {

    public static boolean dp(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); 
            
            if (c == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return false;
                }
            }
            else{
                s.push(c);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "((ef))";

        System.out.println(dp(s));
    }
}
