
class endInsertIntoBST701{
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        if(root.val > val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);

        root.left = b; root.right = c;
        b.left = d; b.right = e;

        preorder(root);
        System.out.println();
        insertIntoBST(root, 5);
        preorder(root);

    }
}