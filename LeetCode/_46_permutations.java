import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _46_permutations {
    public static void helper(List<List<Integer>> ans, List<Integer> perm, int[] nums){
        if(perm.size()==nums.length){
            ans.add(new ArrayList<>(perm));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(perm.contains(nums[i]))
                continue;
            perm.add(nums[i]);
            helper(ans,perm,nums);
            perm.remove(perm.size()-1);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans,new ArrayList<>(),nums);
        return ans;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array Elements : ");
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Total Permutations : "+permute(nums));
    }
}
