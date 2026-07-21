import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class topViewOfBinaryTree {
    public static class Pair{
        TreeNode root;
        int level;
        Pair(TreeNode root, int level){
            this.root = root;
            this.level = level;
        }
    }
    public static ArrayList<Integer> topView(TreeNode root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        q.add(new Pair(root,0));
        int first = 0;
        int last = 0;
        while(!q.isEmpty()){
            Pair pair = q.poll();
            TreeNode rNode = pair.root;
            int lvl = pair.level;
            if(!map.containsKey(lvl)) map.put(lvl, rNode.val);
            if(rNode.left!=null) {
                q.add(new Pair(rNode.left,lvl-1));
                first = Math.min(first,lvl-1);
            }
            if(rNode.right!=null) {
                q.add(new Pair(rNode.right,lvl+1));
                last = Math.max(last,lvl+1);
            }
        }
        while(first<=last)
            ans.add(map.get(first++));
        return ans;
    }

    static void main(String[] args) {
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

        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();
        System.out.print("Top view of Binary Tree : "+topView(a));
    }
    public static void preorder(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
}