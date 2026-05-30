
class diameterOfBinaryTree543{
    //Method 1 : TC = O(n square);
    private static void preorder(TreeNode root){
        if(root == null) {
            System.out.print("null ");
            return;
        }

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int level(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int myDia = level(root.left) + level(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        return Math.max(myDia, Math.max(leftDia, rightDia));
    }
    //Method 2 : TC = O(n);
    public static int currDiameter(TreeNode root,int[] ans){
        if(root == null) return 0;
        int ll = currDiameter(root.left,ans);
        int lr = currDiameter(root.right,ans);
        int myDia = ll + lr;
        ans[0] = Math.max(myDia, ans[0]);
        return 1 + Math.max(ll,lr);
    }
    public static int diameterOfBinaryTree2(TreeNode root) {
        int[] ans = {0};
        currDiameter(root,ans);
        return ans[0];
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode b = new TreeNode(-7);
        TreeNode c = new TreeNode(-3);
        TreeNode d = new TreeNode(-9);
        TreeNode e = new TreeNode(-3);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(-7);
        TreeNode h = new TreeNode(-4);
        TreeNode i = new TreeNode(6);
        TreeNode j = new TreeNode(-6);
        TreeNode k = new TreeNode(-6);
        TreeNode l = new TreeNode(0);
        TreeNode m = new TreeNode(6);
        TreeNode n = new TreeNode(5);
        TreeNode o = new TreeNode(9);
        TreeNode p = new TreeNode(-1);
        TreeNode q = new TreeNode(-4);
        TreeNode r = new TreeNode(-2);

        root.left = b; root.right = c;
        c.left = d; c.right = e;
        d.left = f; d.right = g;
        e.left = h;
        f.left = i;
        g.left = j; g.right = k;
        i.left = l; i.right = m;
        j.left = n; k.left = o;
        l.right = p;
        m.left = q;
        o.left = r;

        preorder(root);
        System.out.println();

        System.out.println("Diameter of Binary Tree : "+diameterOfBinaryTree(root));
        System.out.println("Diameter of Binary Tree Method 2 : "+diameterOfBinaryTree2(root));
    }
}