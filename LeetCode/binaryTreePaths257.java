import java.util.ArrayList;
import java.util.List;


class binaryTreePaths257{
    public static void helper(TreeNode root, String s, List<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans.add(s+root.val);
            return;
        }
        helper(root.left, s+root.val+"->", ans);
        helper(root.right, s+root.val+"->", ans);
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        helper(root, "", ans);
        return ans;
    }
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        root.left = b; root.right = c;
        b.right = d;
        c.right = e;

        preorder(root);
        System.out.println();
        System.out.println("Binary Tree Paths : "+binaryTreePaths(root));
    }
}