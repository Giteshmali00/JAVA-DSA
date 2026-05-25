import java.util.Queue;
import java.util.LinkedList;

public class levelOrderTraversal {
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.left = h;

        levelOrder(root);
    }
}
