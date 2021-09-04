import java.util.LinkedList;
import java.util.Queue;

public class BstWalkOne {
    public static void main(String[] args) {
        System.out.println("done here...");
        return;
    }


    public static void walk(BstNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        walk(root.getLeft());
        walk(root.getRight());
    }

    public static void PrintLevelOrder(BstNode root) {
        if (root == null) {
            return;
        }
        Queue<BstNode> q = new LinkedList<BstNode>();
        q.add(root);
        while (!q.isEmpty()) {
            BstNode temp = q.remove();
            System.out.println(temp.getData());
            if (temp.getLeft() != null) {
                q.add(temp.getLeft());
            }   
            if (temp.getRight() != null) {
                q.add(temp.getRight());
            }
        }
    }


    class BstNode {
        private int data;
        private BstNode left;
        private BstNode right;
        
        public BstNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public BstNode getLeft() {
            return left;
        }

        public void setLeft(BstNode left) {
            this.left = left;
        }

        public BstNode getRight() {
            return right;
        }

        public void setRight(BstNode right) {
            this.right = right;
        }
    }


    class Node{
    
        public Node left;
        public Node right;
        public Integer value;
        
        public Node(Integer value) {
          this.left = null;
          this.right = null;
          this.value = value;
        }

        
      }

}