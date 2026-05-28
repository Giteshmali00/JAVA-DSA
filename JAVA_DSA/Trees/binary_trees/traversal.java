import java.util.LinkedList;
import java.util.Queue;
class traversal{
    private static void preorder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(TreeNode root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    //Breadth-First Search (BFS) :-
    private static void levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.val+" ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
        System.out.println();
    }
    private static void nthLevel(TreeNode root, int n){
        if(root==null) return;
        if(n==0){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
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

        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();

        System.out.print("Inorder : ");
        inorder(a);
        System.out.println();

        System.out.print("Postorder : ");
        postorder(a);
        System.out.println();

        System.out.print("Level order : ");
        levelOrder(a);

        System.out.print("Print Nth Level : ");
        nthLevel(a, 2);

    }
}