public class palindromeLL {
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
    public static Node headLast;
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

    public static Node getMiddle(Node temp) {
        Node slow = temp;
        Node fast = temp;

        while (fast != null && fast.next != null) {
         slow = slow.next;
         fast  = fast.next.next;   
        }

        return slow;
    }

    public void reverseFromMiddle(){
        Node midNode = getMiddle(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = prev;
    }

    public boolean checkPalindromeLL(Node head,Node tail){
        while (head.next != null ||tail.next != null) {
            if (head.data != tail.data) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }


    public void printLL() {
        Node temp = head;

        while (temp != null ) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        palindromeLL ll = new palindromeLL();

        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.addMiddle(9,  1);
        ll.addMiddle(9, 3);
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
        ll.reverseFromMiddle();
        System.out.println(ll.checkPalindromeLL(head,tail));

    }
}    
