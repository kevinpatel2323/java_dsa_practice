public class doublyLL {

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



    public static void main(String[] args) {
        Node n1 = new Node(9);
        Node n2 = new Node(8);
        Node n3 = new Node(10);

        n2.next = n3;
        n2.prev = n1;

        n1.prev = null;
        n1.next = n2;

        n3.next = null;
        n3.prev = n2;


        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);

        System.out.println(n1.next.data);


    }
}
