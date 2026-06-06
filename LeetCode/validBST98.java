import java.util.ArrayList;
import java.util.List;


class validBST98{
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // ----------------------------------------------------------------
    //Method 1 : Using Static Variable TC = O(n)
    // ----------------------------------------------------------------
    static boolean flag;
    public static long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long leftMax = max(root.left);
        if(root.val <= leftMax) {
            flag = false;
            return 0;
        }
        long rightMax = max(root.right);
        return Math.max(root.val, Math.max(leftMax,rightMax));
    }
    public static long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long leftMin = min(root.left);
        long rightMin = min(root.right);
        if(root.val >= rightMin){
            flag = false;
            return 0;
        }
        return Math.min(root.val, Math.min(leftMin, rightMin));
    }
    public static boolean isValidBST(TreeNode root) {
        flag = true;
        max(root);
        if(!flag) return flag;
        min(root);
        return flag;
    }
    // ----------------------------------------------------------------
    //Method 2 : 
    // ----------------------------------------------------------------
    public static long max2(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        return Math.max(root.val, Math.max(max2(root.left), max2(root.right)));
    }
    public static long min2(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        return Math.min(root.val, Math.min(min2(root.left), min2(root.right)));
    }
    public static boolean isValidBST2(TreeNode root) {
        if(root==null) return true;
        if(root.val <= max2(root.left)) return false;
        if(root.val >= min2(root.right)) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    // ----------------------------------------------------------------
    //Method 3 :
    // ----------------------------------------------------------------
    public static void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
    public static boolean isValidBST3(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(8);

        root.left = b; root.right = c;
        c.left = d; c.right = e;

        preorder(root);
        System.out.println();

        System.out.println("M1 - Is this Binary Search Tree? : "+isValidBST(root));
        System.out.println("M2 - Is this Binary Search Tree? : "+isValidBST2(root));
        System.out.println("M3 - Is this Binary Search Tree? : "+isValidBST3(root));
    }
}