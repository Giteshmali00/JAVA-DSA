import java.util.Queue;
import java.util.LinkedList;

public class levelOrderTraversal {
    public static void levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.val+" ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        g.left = h;

        levelOrder(root);
    }
}
