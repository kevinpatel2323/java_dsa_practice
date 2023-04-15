public class circularQueue {
    static class queue{
        static int front;
        static int rear;
        static int arr[];
        static int size;

        queue(int n){
            arr = new int[n];
            front = -1;
            rear = -1;
            size = n;
        }
        
        public static boolean isempty() {
            return rear == -1 && front == -1;
        }

        public static boolean isfull() {
            return front == (rear+1)%size;
        }

        public static void add(int n) {
            if (isfull()) {
                System.out.println("Queue full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
           
            rear = (rear+1)%size;
            arr[rear] = n;
        }

        public static int remove() {
            if (isempty()) {
                return -1;
            }
            if (rear == front) {
                rear = front = -1;
            }
            int x = arr[front];

            front = (front+1)%size;

            return x;
        }

        public static int peek() {
            if (isempty()) {
                return -1;
            }
            int x = arr[front];
            return x;
        }

        public static void print() {
            for (int i = front; i!=rear+1; i=(i+1)%size) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        q.remove();
        q.remove();

        q.add(5);

        q.print();
    }
}
