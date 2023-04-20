import java.util.*;

public class minDistBtn2Nodes {
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

        public static void printKLevel(Node root,int level,int k) {
            if (root == null) {
                return;
            }
            if (level == k) {
                System.out.println(root.data);
                return;
            }

            printKLevel(root.left, level+1, k);
            printKLevel(root.right, level+1, k);
        }

        public static Node lca(Node root,int n1,int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node left = lca(root.left, n1, n2);
            Node right = lca(root.right, n1, n2);

            if (right == null) {
                return left;
            }

            if (left == null) {
                return right;
            }

            return root;
        }

        public static int lcaDist(Node root, int n) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int ld = lcaDist(root.left, n);
            int rd = lcaDist(root.right, n);

            if (ld == -1 && rd == -1) {
                return -1;
            }
            else if (ld == -1) {
                return rd +1;
            }
            else{
                return ld +1;
            }
        }

        public static int minDist(Node root, int n1,int n2) {
            Node lowestCommonAncestor = lca(root,n1,n2);

            int d1 = lcaDist(lowestCommonAncestor,n1);
            int d2 = lcaDist(lowestCommonAncestor,n2);

            return d1 + d2;
        }

        


    }
    

    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buidTree(nodes);
        tree.printLevelOrder(root);


        System.out.println(tree.minDist(root,4,6));
    }
}
