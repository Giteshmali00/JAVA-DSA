class findSumOfTreeNodes {
    private static void print(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    private static int sum(Node root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int product(Node root) {
        if (root == null)
            return 1;
        return root.val * product(root.left) * product(root.right);
    }

    private static int nonZeroProduct(Node root) {
        if (root == null)
            return 1;
        if (root.val == 0)
            return 1 * nonZeroProduct(root.left) * nonZeroProduct(root.right);
        return root.val * nonZeroProduct(root.left) * nonZeroProduct(root.right);

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        print(a);
        System.out.println();

        System.out.println("Sum of all Tree Nodes : " + sum(a));
        System.out.println("Product of all Tree Nodes : " + product(a));
        System.out.println("Product of all Non-zero Tree Nodes : " + nonZeroProduct(a));

    }
}