
public class symmetricTree101 {
    public static void invert(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) ? isSameTree(p.right, q.right) : false;
    }
    public static boolean isSymmetric(TreeNode root) {
        invert(root.left);
        return isSameTree(root.left, root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(3);
        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        
        System.out.println("is Tree Symmetric? : "+isSymmetric(root));
    }
}
