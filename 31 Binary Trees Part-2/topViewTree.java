import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * topViewTree
 */
public class topViewTree {

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

        static class Info{
            Node node;
            int hd;

            Info(Node node,int hd){
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer,Node> map = new HashMap<>();

            int min = 0, max = 0;

            q.add(new Info(root, 0));
            q.add(null);

            while(!q.isEmpty()){
                Info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }

                    if (curr.node.left != null) {
                        q.add(new Info(curr.node.left, curr.hd-1));
                        min = Math.min(min,curr.hd-1);
                    }

                    if (curr.node.right != null) {
                        q.add(new Info(curr.node.right, curr.hd+1));
                        max = Math.max(min,curr.hd+1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data);
            }

        }


        

    }
    

    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buidTree(nodes);
        tree.printLevelOrder(root);


        tree.topView(root);
    }
}