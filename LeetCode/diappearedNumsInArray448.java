package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class diappearedNumsInArray448 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (i + 1 == arr[i] || (arr[i] == arr[arr[i] - 1]))
                i++;
            else
                swap(arr, arr[i] - 1, i);
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                ans.add(i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(arr));
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
