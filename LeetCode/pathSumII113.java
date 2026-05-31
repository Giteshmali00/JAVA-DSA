import java.util.ArrayList;
import java.util.List;

public class pathSumII113 {
    public static List<Integer> copy(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            newList.add(list.get(i));
        }
        return newList;
    }
    public static void helper(TreeNode root, List<List<Integer>> ans, int targetSum, List<Integer> l){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                l.add(root.val);
                ans.add(l);
            }
            return;
        }
        l.add(root.val);
        helper(root.left, ans, targetSum-root.val, copy(l));
        helper(root.right, ans, targetSum-root.val, copy(l));
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        helper(root, ans, targetSum, l);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(11);
        TreeNode e = new TreeNode(13);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(2);
        TreeNode i = new TreeNode(5);
        TreeNode j = new TreeNode(1);

        root.left = b; root.right = c;
        b.left = d;
        c.left = e; c.right = f;
        d.left = g; d.right = h;
        f.left = i; f.right = j;

        System.out.println("Root to leaf path Matched Sum : "+pathSum(root, 22));
    }
}
