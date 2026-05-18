public class findMaxValInTree {
    public static void print(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    private static int findMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(findMax(root.left), findMax(root.right)));
    }

    private static int findMin(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(findMin(root.left), findMin(root.right)));
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(20);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(50);
        Node f = new Node(6);

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
