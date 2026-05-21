

class sameTree100{
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q == null)) return true;
        if((p == null || q == null) || (p.val != q.val)) return false;
        return isSameTree(p.left,q.left) ? isSameTree(p.right,q.right): false;
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(3);
        p.left = p1; p.right = p2;

        TreeNode q = new TreeNode(1);
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);
        q.left = q1; q.right = q2;

        System.out.println("is Same Tree? : "+isSameTree(p, q));
    }
}