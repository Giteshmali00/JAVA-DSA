package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class subSets78 {
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
        subsets(arr);
        System.out.println(power);
    }
}
