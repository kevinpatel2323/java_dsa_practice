import java.util.LinkedList;
import java.util.Queue;

public class isSubTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node buidTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buidTree(nodes);
            newNode.right = buidTree(nodes);

            return newNode;
        }

        public static void printLevelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static boolean isIdentical(Node root,Node subRoot) {
            if (root == null && subRoot == null) {
                return true;
            }
            else if (root == null || subRoot == null ||root.data != subRoot.data) {
                return false;
            }

            if (!isIdentical(root.left, subRoot.left)) {
                return false;
            }

            if (!isIdentical(root.right, subRoot.right)) {
                return false;
            }

            return true;
        }

        public static boolean subTree(Node root,Node subRoot) {
            if (root == null) {
                return false;
            }

            if (root.data == subRoot.data) {
                if (isIdentical(root,subRoot)) {
                    return true;
                }
            }

            return subTree(root.left,subRoot) || subTree(root.right,subRoot);
        }
    }
    

    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buidTree(nodes);
        tree.printLevelOrder(root);

        tree.idx = -1;
        int[] nodes1 = {3,-1,6,-1,-1};
        Node subRoot = tree.buidTree(nodes1);
        tree.printLevelOrder(subRoot);

        System.out.println(tree.subTree(root, subRoot));

    }
}