import java.util.*;
public class traversalIterative {
    public static List<Integer> preorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);

        while(!st.isEmpty()){
            TreeNode t = st.pop();
            ans.add(t.val);
            if(t.right!=null) st.push(t.right);
            if(t.left!=null) st.push(t.left);
        }
        return ans;
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(!st.isEmpty() || temp!=null){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }else{
                TreeNode t = st.pop();
                ans.add(t.val);
                temp = t.right;
            }
        }
        return ans;
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode t = st.pop();
            ans.add(t.val);
            if(t.left!=null) st.push(t.left);
            if(t.right!=null) st.push(t.right);
        }
        Collections.reverse(ans);
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

        System.out.println("Preorder : "+preorder(a));
        System.out.println("Inorder : "+inorderTraversal(a));
        System.out.println("Postorder : "+postorderTraversal(a));
    }
}
