import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class stackArrayList {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isempty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int x = list.get(list.size()-1);
            list.remove(list.size()-1);
            return x;
        }

        public static int peek(){
            if (isempty()) {
                return -1;
            }
            int x = list.get(list.size()-1);
            return x;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (s.peek() != -1) {
            System.out.println(s.pop());
        }
    }
}
