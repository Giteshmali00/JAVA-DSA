package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class allDuplicatesInArray442 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i + 1 || arr[arr[i] - 1] == arr[i])
                i++;
            else
                swap(arr, arr[i] - 1, i);
        }

        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1)
                ans.add(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(arr));
    }
}
