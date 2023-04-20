
public class searchInBST {
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

        public static boolean search(Node root,int n) {
            if (root == null) {
                return false;
            }

            if (root.data == n) {
                return true;
            }

            if (root.data > n) {
                return search(root.left, n);
            }
            else{
                return search(root.right, n);
            }
        }
    }


    public static void main(String[] args) {

        BST tree = new BST();

        int arr[] = {5,1,2,7,8,3,6,9,0};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = tree.buildTree(root,arr[i]);
        }

        tree.printInOrder(root);

        System.out.println(tree.search(root, 1));
    }
}
