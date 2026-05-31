
public class pathSumIII437 {
    public static int helper(TreeNode root, long sum){
        if(root==null) return 0;
        int count = 0;
        if(root.val==sum) count++;
        count += helper(root.left,sum-root.val) + helper(root.right, sum-root.val);
        return count;
    }
    public static int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(-3);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(11);
        TreeNode g = new TreeNode(3);
        TreeNode h = new TreeNode(-2);
        TreeNode i = new TreeNode(1);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        d.left = g; d.right = h;
        e.right = i;

        System.out.println("Total number of Valid path sum : "+pathSum(a, 8));
    }
}
