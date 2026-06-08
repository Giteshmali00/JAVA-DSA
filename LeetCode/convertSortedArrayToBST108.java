public class convertSortedArrayToBST108 {
    private static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static TreeNode helper(int[] arr, int lo, int hi){
        if(lo > hi) return null;
        if(lo==hi) return new TreeNode(arr[lo]);
        int mid = (lo + hi) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr, lo, mid-1);
        root.right = helper(arr, mid+1, hi);
        return root;
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        TreeNode root = sortedArrayToBST(arr);
        System.out.println("Sorted array converted to BST, Inorder Traversal of that BST : ");
        inorder(root);
    }
}
