
class cunstructBTreefromPreorderAndPostorder889{
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static TreeNode helper(int[] preorder, int[] postorder, int preLo, int preHi, int postLo, int postHi) {
        if(preLo > preHi || postLo > postHi) return null;
        TreeNode root = new TreeNode(preorder[preLo]);
        if(preLo == preHi) return root;
        int r = postLo;
        while(preorder[preLo+1] != postorder[r]) r++;
        int leftSize = r - postLo + 1;
        root.left = helper(preorder, postorder, preLo + 1, preLo + leftSize, postLo, postLo + r);
        root.right = helper(preorder, postorder, preLo + leftSize + 1, preHi, r+1, postHi-1);
        return root;
    }
    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        if(n==1) return new TreeNode(preorder[0]);
        return helper(preorder, postorder, 0, n-1, 0, n-1);
    }
    public static void main(String[] args) {
        int[] preorder = {1,2,4,5,3,6,7};
        int[] postorder = {4,5,2,6,7,3,1};

        TreeNode root = constructFromPrePost(preorder, postorder);

        preorder(root);
        System.out.println();
    }
}