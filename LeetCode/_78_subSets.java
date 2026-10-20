
import java.util.ArrayList;
import java.util.List;

public class _78_subSets {
    //Method 2: Using Bit Manipulation:
    public static List<List<Integer>> subsets2(int[] nums) {
        int n = nums.length;
        int total = (1<<n);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < total; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++){
                int mask = 1<<j;
                if(mask>i) break;
                if((mask&i)!=0) list.add(nums[j]);
            }
            ans.add(list);
        }
        return ans;
    }
    //Method 1: Using recursion
    static List<List<Integer>> power;
    public static void helperSets(int[] arr, ArrayList<Integer> ans, int i) {

        if (arr.length == i) {
            ArrayList<Integer> extra = new ArrayList<>();
            for (int j = 0; j < ans.size(); j++) {
                extra.add(ans.get(j));
            }
            power.add(extra);
            return;
        }

        helperSets(arr, ans, i + 1);
        ans.add(arr[i]);
        helperSets(arr, ans, i + 1);
        ans.remove(ans.size() - 1);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        power = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helperSets(nums, ans, 0);
        return power;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(subsets2(arr));
    }
}
