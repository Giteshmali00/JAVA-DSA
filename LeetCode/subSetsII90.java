package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class subSetsII90 {
    static List<List<Integer>> powerAns;

    public static void set(int[] nums, List<Integer> ans, int i) {
        if (i == nums.length) {
            List<Integer> helper = new ArrayList<>(ans);
            powerAns.add(helper);
            return;
        }

        // boolean yn = true;
        // for(int j = 0; j < ans.size(); j++){
        // if(ans.get(j)==ans.get(i)) yn=false;
        // }

        if (ans.size() == 0) {
            set(nums, ans, i + 1);
            ans.add(nums[i]);
            set(nums, ans, i + 1);
        }
        if (ans.size() > 0) {
            if (nums[i] != ans.get(ans.size() - 1)) {
                set(nums, ans, i + 1);
            }
        }
        if (ans.size() > 0) {
            if (nums[i] == ans.get(ans.size() - 1)) {
                ans.add(nums[i]);
                set(nums, ans, i + 1);
            }
        }
        // ans.add(nums[i]);
        // set(nums, ans, i + 1);
        ans.remove(ans.size() - 1);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        powerAns = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        set(nums, ans, 0);
        return powerAns;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 1, 4 };
        subsetsWithDup(arr);
        System.out.print(powerAns);
    }
}
