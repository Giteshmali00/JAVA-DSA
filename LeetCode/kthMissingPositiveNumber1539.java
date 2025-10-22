package LeetCode;

public class kthMissingPositiveNumber1539 {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int tms = arr[mid] - (mid + 1);

            if (tms < k) {
                lo = mid + 1;
            } else
                hi = mid - 1;
        }

        return k + hi + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println("Kth missing Element is : " + findKthPositive(arr, k));
    }
}
