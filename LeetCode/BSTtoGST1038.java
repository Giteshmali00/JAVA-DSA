public class BSTtoGST1038 {
    private static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    //Method 1 :
    static int sum;
    public static void reverseInorder(TreeNode root, int sum){
        if(root==null) return;
        reverseInorder(root.right, sum);
        root.val += sum;
        sum = root.val;
        reverseInorder(root.left, sum+root.val);
    }
    public static TreeNode bstToGst(TreeNode root) {
        sum = 0;
        reverseInorder(root,0);
        return root;
    }

    static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(9);
        TreeNode h = new TreeNode(3);
        TreeNode i = new TreeNode(5);

        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; e.right = i;

        System.out.print("Before : ");
        inorder(root);
        System.out.println();
        bstToGst(root);
        System.out.print("After : ");
        inorder(root);
    }
}
