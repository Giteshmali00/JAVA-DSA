
public class cunstructBTreefromInorderAndPostorder106 {
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
 
    public static TreeNode helper(int[] inorder, int[] postorder, int postLo, int postHi, int inLo, int inHi) {
        if(postLo > postHi || inLo > inHi) return null;
        TreeNode root = new TreeNode(postorder[postHi]);
        int r = 0;
        while(postorder[postHi] != inorder[r]) r++;
        root.left = helper(inorder, postorder, postLo, postLo + (r-inLo)-1, inLo, r-1);
        root.right = helper(inorder, postorder, postLo + (r-inLo), postHi-1, r+1, inHi);

        return root;
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return helper(inorder, postorder, 0, n-1, 0, n-1);
    }
    public static void main(String[] args) {
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = buildTree(inorder,postorder);

        preorder(root);
        System.out.println();
    }
}
