class findSumOfTreeTreeNodes {
    private static void print(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    private static int sum(TreeNode root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int product(TreeNode root) {
        if (root == null)
            return 1;
        return root.val * product(root.left) * product(root.right);
    }

    private static int nonZeroProduct(TreeNode root) {
        if (root == null)
            return 1;
        if (root.val == 0)
            return 1 * nonZeroProduct(root.left) * nonZeroProduct(root.right);
        return root.val * nonZeroProduct(root.left) * nonZeroProduct(root.right);

    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(0);
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
        System.out.println();

        System.out.println("Sum of all Tree TreeNodes : " + sum(a));
        System.out.println("Product of all Tree TreeNodes : " + product(a));
        System.out.println("Product of all Non-zero Tree TreeNodes : " + nonZeroProduct(a));

    }
}