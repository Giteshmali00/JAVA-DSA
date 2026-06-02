
public class cunstructBTreefromPreorderAndPostorder105 {
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
 
    public static TreeNode helper(int[] preorder, int[] inorder, int preLo, int preHi, int inLo, int inHi){
        if(preLo > preHi || inLo > inHi) return null;
        int n = preorder.length;
        TreeNode root = new TreeNode(preorder[preLo]);
        int r = 0;
        while(preorder[preLo] != inorder[r]) r++;
        
        root.left = helper(preorder, inorder, preLo+1, preLo + (r - inLo), inLo, r-1);
        root.right = helper(preorder, inorder, preLo+(r-inLo) + 1, preHi, r+1, inHi);

        return root;
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = buildTree(preorder, inorder);

        preorder(root);
        System.out.println();
    }
}
