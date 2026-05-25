import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class bTreeLevelOrderTraversal102{
    //Method 1 : Using Queue and without using Pair class
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        q.add(null);

        while(q.size() > 1){
            List<Integer> l = new ArrayList<>();
            while(q.peek()!=null) {
                TreeNode t = q.poll();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                l.add(t.val);
            }
            q.poll();
            ans.add(l);
            q.add(null);
        }
        
        return ans;
    }
    //Method 2 : Withoud using using Queue and Pair class
    public static int level(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    public static List<Integer> nthLevel(TreeNode root, int n, List<Integer> l){
        if(root==null) return l;
        if(n==0){
            l.add(root.val);
            return l; // This is only for return back to the function
        }
        nthLevel(root.left, n - 1, l);
        nthLevel(root.right, n - 1, l);
        return l;
    }
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = level(root);
        for(int i = 0; i < n; i++)
            ans.add(nthLevel(root, i, new ArrayList<>()));
        
        return ans;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h;
        f.right = i;

        
        System.out.println("Level Order Traversal : "+levelOrder(a));
        System.out.println("Level Order Traversal2 : "+levelOrder2(a));
    }
}