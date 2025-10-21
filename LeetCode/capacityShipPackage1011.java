package LeetCode;

import java.util.Scanner;

public class capacityShipPackage1011 {
    public static boolean isPossible(int[] arr, int capacity, int days) {
        int load = 0;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] <= capacity)
                load += arr[i];
            else {
                load = arr[i];
                days--;
            }
        }
        if (days > 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Days : ");
        int days = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        int tsum = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(arr[i], mx);
            tsum += arr[i];
        }
        int lo = mx;
        int hi = tsum;
        int caps = tsum;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isPossible(arr, mid, days)) {
                caps = mid;
                hi = mid - 1;
            } else
                lo = mid + 1;
        }

        System.out.print("Minimum Capacity : " + caps);
    }
}
