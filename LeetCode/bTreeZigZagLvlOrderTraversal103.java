import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bTreeZigZagLvlOrderTraversal103 {
    public static class Pair{
        TreeNode node;
        int lvl;
        Pair(TreeNode node, int lvl){
            this.node = node;
            this.lvl = lvl;
        }
    }
    public static int level(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    public static void BFS(TreeNode root, List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            ans.get(temp.lvl).add(temp.node.val);
            if(temp.node.left != null) q.add(new Pair(temp.node.left, temp.lvl+1));
            if(temp.node.right != null) q.add(new Pair(temp.node.right, temp.lvl+1));
        }
        for(int i = 1; i < ans.size(); i+=2)
            Collections.reverse(ans.get(i));
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int level = level(root);
        for(int i = 0; i < level; i++)
            ans.add(new ArrayList());
        BFS(root,ans);
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

        
        System.out.println("Zig Zag Level Order Traversal : "+zigzagLevelOrder(a));
    }

}