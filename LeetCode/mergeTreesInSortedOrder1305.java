import java.util.ArrayList;
import java.util.List;

public class mergeTreesInSortedOrder1305 {
    public static void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static void finalCheck(List<Integer> list1, List<Integer> list2, List<Integer> ans){
        int i = 0;
        int j = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                ans.add(list1.get(i++));
            }else ans.add(list2.get(j++));
        }
        while(i < list1.size()) ans.add(list1.get(i++));
        while(j < list2.size()) ans.add(list2.get(j++));
    }
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        finalCheck(list1,list2,ans);
        return ans;
    }
    static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(4);
        root1.left = a; root1.right = b;
        inorder(root1);
        System.out.println();

        TreeNode root2 = new TreeNode(1);
        TreeNode z = new TreeNode(0);
        TreeNode x = new TreeNode(3);
        root2.left = z; root2.right = x;
        inorder(root2);
        System.out.println();

        System.out.println("Final merged List : "+getAllElements(root1,root2));


    }
}
