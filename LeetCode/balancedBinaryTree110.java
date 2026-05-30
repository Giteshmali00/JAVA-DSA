
public class balancedBinaryTree110 {
    public static int level(TreeNode root, boolean[] ans){
        if(root==null) return 0;
        int ll = level(root.left,ans);
        int rl = level(root.right,ans);
        int diff = Math.abs(ll - rl);
        if(diff>1) ans[0] = false;
        return 1 + Math.max(ll,rl);
    }
    public static boolean isBalanced(TreeNode root) {
        boolean[] ans = {true};
        level(root,ans);
        return ans[0];
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

        System.out.println("is Tree Balanced ? : "+isBalanced(a));
    }
}
