public class linkedlistQueue {
    static class Node {
        int data;
        Node next;

        Node(int n){
            this.data = n;
            this.next = null;
        }
    }

    static class queue{
        public static Node head;
        public static Node tail;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int n) {
            Node newNode = new Node(n);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int x = head.data;
            return x;
        }

        public static void printQ() {
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        queue q = new queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.printQ();

        System.out.println(q.peek());


    }
}
