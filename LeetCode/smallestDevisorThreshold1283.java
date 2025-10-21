package LeetCode;

import java.util.Scanner;

public class smallestDevisorThreshold1283 {
    public static boolean isLess(int[] arr, int mid, int t) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0)
                sum = arr[i] / mid;
            else
                sum = arr[i] / mid + 1;
        }
        if (sum <= t)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 23, 44, 32, 56 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int threshold = sc.nextInt();
        int mx = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.min(arr[i], mx);
        }
        int lo = 1;
        int hi = mx;
        int divisor = 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isLess(arr, mid, threshold)) {
                divisor = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println("Divisor = " + divisor);
    }
}
