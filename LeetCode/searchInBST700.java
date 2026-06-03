
public class searchInBST700 {
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(val==root.val) return root;
        if(root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);

        root.left = b; root.right = c;
        b.left = d; b.right = e;

        
        preorder(searchBST(root, 2));
    }
}
