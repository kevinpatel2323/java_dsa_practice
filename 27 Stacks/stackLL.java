
public class stackLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class stack{
        public static Node head;

        public static boolean isempty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isempty()) {
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode; 
            }
        }

        public static int pop() {
            if (isempty()) {
                return -1;
            }
            else{
                int x = head.data;
                head = head.next;
                return x;
            }
        }

        public static int peek() {
            if (isempty()) {
                return -1;
            }
            else{
                int x = head.data;
                return x;
            }
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
