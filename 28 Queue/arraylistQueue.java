public class arraylistQueue {
    static class queue{
        static int front;
        static int rear;
        static int arr[];

        queue(int n){
            arr = new int[n];
            front = -1;
            rear = -1;
        }
        
        public static boolean isempty() {
            return rear==-1;
        }

        public static void add(int n) {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = n;
        }

        public static int remove() {
            if (isempty()) {
                return -1;
            }
            int x = arr[front];

            for (int i = 0; i <= rear; i++) {
                arr[i] = arr[i+1];
            }

            rear--;
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
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);

        q.add(0);
        q.add(1);
        q.add(2);
        
        q.remove();
        System.out.println(q.peek());
        q.add(3);
        

        q.print();
    }
}
