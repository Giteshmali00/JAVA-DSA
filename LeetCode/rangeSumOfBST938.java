
public class rangeSumOfBST938 {
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val < low) return rangeSumBST(root.right, low, high);
        if(root.val > high) return rangeSumBST(root.left, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(18);

        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.right = f;

        preorder(root);
        System.out.println();
        System.out.println("Sum of the nodes which lies in low to high : " +rangeSumBST(root, 7, 15));

    }
}
