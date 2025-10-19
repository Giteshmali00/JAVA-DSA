package LeetCode;

public class searchInSortedArray33 {
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] <= arr[hi]) {
                if (target > arr[mid] && target <= arr[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            } else {
                if (target >= arr[lo] && target < arr[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int x = 0;

        int ele = search(arr, x);
        System.out.print("Element found at " + ele);

    }
}
