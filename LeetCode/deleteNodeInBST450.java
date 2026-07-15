public class deleteNodeInBST450 {
    private static void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static TreeNode iop(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right!=null)
            temp = temp.right;
        return temp;
    }
    public static TreeNode parent(TreeNode root, TreeNode pred){
        TreeNode temp = root.left;
        while(temp.right!=pred && temp != pred) temp = temp.right;
        return temp;
    }
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null && root.right==null) return null;
            else if(root.right==null) return root.left;
            else if(root.left==null) return root.right;
            else{
                TreeNode pred = iop(root);
                TreeNode predParent = parent(root,pred);

                predParent.right = pred.left;
                if(root.left!=pred) pred.left = root.left;
                if(root.right!=pred) pred.right = root.right;
                root.left = null; root.right = null;
                return pred;
            }
        }
        if(root.val > key) root.left = deleteNode(root.left,key);
        else if(root.val < key) root.right = deleteNode(root.right,key);
        return root;
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(9);
        TreeNode h = new TreeNode(3);
        TreeNode i = new TreeNode(5);

        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; e.right = i;

        System.out.print("Inorder traversal : ");
        inorder(root);
        System.out.println();
        System.out.println("After deletion...");
        deleteNode(root,5);
        System.out.print("Inorder traversal : ");
        inorder(root);
    }
}
