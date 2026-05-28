public class findMaxValInTree {
    public static void print(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    private static int findMax(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(findMax(root.left), findMax(root.right)));
    }

    private static int findMin(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(findMin(root.left), findMin(root.right)));
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(50);
        TreeNode f = new TreeNode(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        print(a);
        System.out.println();

        System.out.println("Maximum number in the Tree: " + findMax(a));
        System.out.println("Minimum number in the Tree : " + findMin(a));
    }
}
