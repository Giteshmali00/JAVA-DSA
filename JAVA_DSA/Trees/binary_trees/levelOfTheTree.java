public class levelOfTheTree {
    public static void print(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    private static int level(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(level(root.left), level(root.right));
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        print(a);
        System.out.println();
        System.out.println("Levels of the tree : " + level(a));

    }
}
