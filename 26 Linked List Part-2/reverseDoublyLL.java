public class reverseDoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;


    public void revDLL(){
        Node prev = null;
        Node curr = head;
        Node next;

        tail = curr;

        while(curr != null){
            if (curr.next == null) {
                next = null;
                head = curr;
            }
            else{
                next = curr.next;
            }
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        
    }

    public void printLL(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

 
    public static void main(String[] args) {
        reverseDoublyLL LL = new reverseDoublyLL();
        Node n1 = new Node(8);
        Node n2 = new Node(9);
        Node n3 = new Node(10);
        head = n1;
        tail = n3;

        n1.prev = null;
        n1.next = n2;

        n2.next = n3;
        n2.prev = n1;

        n3.next = null;
        n3.prev = n2;

        

        LL.printLL(head);

        LL.revDLL();
        System.out.println();
        LL.printLL(head);
    }
}
