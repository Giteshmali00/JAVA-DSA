package JAVA_DSA.recursion;

import java.util.ArrayList;
import java.util.List;

public class powerSetLeetCode78 {
	static List<List<Integer>> power;

	public static void helper(int[] arr, List<Integer> ans, int i) {
		if (arr.length == i) {
			List<Integer> extra = new ArrayList<>();
			for (int j = 0; j < ans.size(); j++) {
				extra.add(ans.get(j));
			}
			power.add(extra);
			return;
		}
		helper(arr, ans, i + 1);
		ans.add(arr[i]);
		helper(arr, ans, i + 1);
		ans.remove(ans.size() - 1);
	}

	public static List<List<Integer>> subSets(int[] arr) {
		List<Integer> ans = new ArrayList<>();
		power = new ArrayList<>();
		helper(arr, ans, 0);
		return power;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1 };
		subSets(arr);
		System.out.print(power);
	}
}