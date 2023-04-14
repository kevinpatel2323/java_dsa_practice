import java.util.Stack;

public class nextGreaterElement {

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int a[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            } 
            
            // System.out.println(s);
            // System.out.println(s.isEmpty());
            if (s.isEmpty()){
                a[i] = -1;
            }
            else{
                a[i] = arr[s.peek()];
            }

            s.push(i);
        }   

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}