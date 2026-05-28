class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class implementationOfTree {
    public static void print(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        print(a);

    }
}