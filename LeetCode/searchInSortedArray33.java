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
            if (arr[mid] <= arr[hi]) {// mid is in right side's sorted part
                if (arr[mid] <= target && target <= arr[hi])
                    lo = mid + 1;// target is in mid - hi
                else
                    hi = mid - 1;// target is in lo - mid
            } else {// mid is in left side's sorted part
                if (arr[mid] >= target && target >= arr[lo])
                    hi = mid - 1; // target is in lo - mid
                else
                    lo = mid + 1;// target is in mid - hi
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
