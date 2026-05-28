import java.util.*;
public class preorderInterative {
    public static void preorder(TreeNode root, List<Integer> ans){
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);

        while(!st.isEmpty()){
            TreeNode t = st.pop();
            ans.add(t.val);
            if(t.right!=null) st.push(t.right);
            if(t.left!=null) st.push(t.left);
        }
    }
    public static List<Integer> preorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
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

        System.out.print("Preorder : "+preorder(a));
    }
}
