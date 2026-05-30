import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class leftViewOfBinaryTree {
    public static int level(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    public static void dfs(TreeNode root, int lvl, List<Integer> ans){
        if(root==null) return;
        dfs(root.right, lvl+1, ans);
        dfs(root.left, lvl+1, ans);
        ans.set(lvl,root.val);
    }
    public static ArrayList<Integer> leftView(TreeNode root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int level = level(root);
        for(int i = 0; i < level; i++)
            ans.add(0);
        dfs(root,0,ans);
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
        c.left = f; c.right = g;
        e.left = h;
        f.right = i;

        System.out.println("Left Side View : "+leftView(a));
    }
}
