import java.util.Arrays;

public class BSTfromPreorderTraversal1008 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    private static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static TreeNode helper(int[] pre, int[] in, int plo, int phi, int ilo, int ihi){
        if(plo > phi || ilo > ihi) return null;
        TreeNode root = new TreeNode(pre[plo]);
        int r = 0;
        while(pre[plo] != in[r]) r++;
        int leftSize = r - ilo;
        root.left = helper(pre, in, plo+1, plo+leftSize, ilo, r-1);
        root.right = helper(pre, in, plo+leftSize+1,phi, r+1, ihi);
        return root;

    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int[] inorder = Arrays.copyOf(preorder,n);
        Arrays.sort(inorder);
        return helper(preorder, inorder, 0, n-1, 0, n-1);
    }
    static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        System.out.print("Preorder (Array) : ");
        print(preorder);
        TreeNode root = bstFromPreorder(preorder);
        System.out.print("Inorder (BST) : ");
        inorder(root);
    }
}
