public class findSizeOfTree {
    public static void print(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    private static int size(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(33);
        TreeNode h = new TreeNode(62);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.left = g;
        f.right = h;

        print(a);
        System.out.println();

        System.out.println("Size of the Tree : " + size(a));

    }
}
