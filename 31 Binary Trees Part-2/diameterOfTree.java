import java.util.LinkedList;
import java.util.Queue;

public class diameterOfTree {
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

        public static int maxHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = maxHeight(root.left);
            int rh = maxHeight(root.right);

            return Math.max(lh, rh)+1;
        }

        public static int diameter(Node root) {//O(n^2)
            if (root == null) {
                return 0;
            }
    
            int ld = diameter(root.left);
            int lh = maxHeight(root.left);
            int rd = diameter(root.left);
            int rh = maxHeight(root.right);

            int selfDiameter = lh + rh + 1;
            
            return Math.max(selfDiameter, Math.max(ld,rd));
        }

        static class Info {
            int diam;
            int ht;

            public Info(int diam,int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter1(Node root) {//O(n)
            if (root == null) {
                return new Info(0,0);
            }

            Info leftInfo = diameter1(root.left);
            Info rightInfo = diameter1(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht);
        }
    }

    

    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buidTree(nodes);

        tree.printLevelOrder(root);

        System.out.println("Max height = " + tree.maxHeight(root));

        System.out.println("Diameter = " + tree.diameter1(root).diam);

    }
}