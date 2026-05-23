
public class LCAofBinaryTree236 {
    public static boolean ifExists(TreeNode root, TreeNode poq){
        if(root==null) return false;
        if(root==poq) return true;
        return ifExists(root.left, poq) ? true : ifExists(root.right, poq);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q) return root;

        boolean pLiesInLst = ifExists(root.left, p);
        boolean qLiesInLst = ifExists(root.left, q);
        if(pLiesInLst && qLiesInLst) return lowestCommonAncestor(root.left, p, q);
        if(!pLiesInLst && !qLiesInLst) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(0);
        TreeNode g = new TreeNode(8);
        TreeNode h = new TreeNode(7);
        TreeNode i = new TreeNode(4);

        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; e.right = i;

        TreeNode p = b;
        TreeNode q = c;

        preorder(root);
        System.out.println();

        System.out.print("Lowest Common Ancestor : "+lowestCommonAncestor(root, p, q).val);
    }
}
