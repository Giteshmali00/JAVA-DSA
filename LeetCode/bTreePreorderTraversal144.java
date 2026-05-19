import java.util.ArrayList;
import java.util.List;

public class bTreePreorderTraversal144 {
    public static void preorder(TreeNode root, List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        preorder(root,ans);

        return ans;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.left = f; e.right = g;
        c.right = h;
        h.left = i;

        System.out.println("Preorder : "+ preorderTraversal(a));

    }
}
