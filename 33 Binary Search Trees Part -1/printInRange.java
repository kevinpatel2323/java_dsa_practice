public class printInRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static class BST{
        
        public static Node buildTree(Node root,int n) {
            if (root == null) {
                root = new Node(n);
                return root;
            }

            if (root.data > n) {
                root.left = buildTree(root.left,n);
            }
            else{
                root.right = buildTree(root.right,n);
            }
            return root;
        }

        public static void printInOrder(Node root) {
            if (root == null) {
                return;
            }
            printInOrder(root.left);
            System.out.println(root.data);
            printInOrder(root.right);
        }

        public static void InRange(Node root,int n1,int n2) {
            if (root == null) {
                return;
            }

            if (root.data >= n1 && root.data <= n2) {
                InRange(root.left, n1, n2);
                System.out.print(root.data + " ");
                InRange(root.right, n1, n2);
            }
            else if (root.data > n2) {
                InRange(root.right, n1, n2);
            }
            else{
                InRange(root.right, n1, n2);
            }
        }
    }
    public static void main(String[] args) {

        BST tree = new BST();

        int arr[] = {5,1,2,7,8,3,4,9,10};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = tree.buildTree(root,arr[i]);
        }

        tree.printInOrder(root);

        tree.InRange(root,2,7);
    }
}
