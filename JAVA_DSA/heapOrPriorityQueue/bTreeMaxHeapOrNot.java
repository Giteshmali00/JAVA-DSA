import com.sun.source.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class bTreeMaxHeapOrNot {
    public static boolean isMaxHeap(TreeNode root){
        return isHeap(root) && isCBT(root);
    }
    public static boolean isCBT(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return true;

        if(root.right==null){
            if(root.left.left!=null) return false;
        }else if(root.left==null) return false;

        return isCBT(root.left) && isCBT(root.right);
    }

    public static boolean isHeap(TreeNode root) {
        if(root==null) return true;
        if(root.left!=null){
            if(root.val < root.left.val) return false;
        }
        if(root.right!=null){
            if(root.val < root.right.val) return false;
        }
        return isHeap(root.left) && isHeap(root.right);
    }

    static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(4);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.left = new TreeNode(5);

        System.out.println(isMaxHeap(a));
    }
}
