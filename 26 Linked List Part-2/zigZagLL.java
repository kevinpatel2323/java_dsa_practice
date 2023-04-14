public class zigZagLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int c;

    public void addFirst(int data){
        Node newnode = new Node(data);
        c++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        c++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void addMiddle(int data,int i){
        Node newnode = new Node(data);
        c++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        Node temp = head;
        int currIdx = 0;

        while (currIdx<i) {
            temp = temp.next;
            currIdx++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("LL empty");
            return;
        }
        c--;
        head = head.next;

    }

    public void removeLast(){
        if (head == null) {
            System.out.println("LL empty");
            return;
        }
        
        

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;

        c--;
    }

    //Search - searches for a key in LL

    //Iterative 
    public void iterativeSearch(int key){
        if (head == null) {
            System.out.println("Can't search in an empty list");
            return;
        }
        Node temp = head;
        int i = 0;

        while (temp.data!=key) {
            if (temp.next==null) {
                System.out.println("Key not found");
                return;
            }
            temp = temp.next;
            i++;
        }

        System.out.println("Key found at : " + i);
    }

    //recursive
    public void recursiveSearch(Node temp,int key,int idx){
        if (temp==null) {
            System.out.println("Can't search in an empty list");
            return;
        }
        
        if (temp.data == key) {
            System.out.println("Key found at : " + idx);
            return;
        }

        if (temp.next == null) {
            System.out.println("Key not found");
            return;
        }
        

        recursiveSearch(temp.next, key, idx+1);
    }

    //zig-zag

    public void revMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }   
        Node mid = slow;
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = prev;
    }
    

    public void zigZag(Node head,Node tail){
        Node n1 = head;
        Node n2 = tail;
        Node n1nxt , n2nxt;
        while (n1.next != null && n2.next != null) {
            n1nxt = n1.next;
            n1.next = n2;
            n2nxt = n2.next;
            n2.next = n1nxt;

            n1 = n1nxt;
            n2 = n2nxt;
        }
    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void printLLR() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        zigZagLL ll = new zigZagLL();

        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(5, 1);
        ll.addMiddle(6, 4);
        ll.printLL();
        ll.revMid(head);
        System.out.println(tail.data);
        ll.printLLR();
        ll.printLL();
        ll.zigZag(head, tail);
        ll.printLL();
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printLL();
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(c);
        // ll.iterativeSearch(1);
        // ll.recursiveSearch(head, 0, 0);
        
    }
}
