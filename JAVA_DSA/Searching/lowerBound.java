package JAVA_DSA.Searching;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = { 10, 23, 46, 46, 91, 97, 97, 140, 264 };
        int n = arr.length;
        int hi = n - 1;
        int lo = 0;
        int target = 46;
        int lb = n;

        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {/* for Upper bound : arr[mid] > target */
                lb = Math.min(mid, lb);
                hi = mid - 1;
            } else
                lo = mid + 1;
        }
        System.out.println("Lower bound : " + lb);
    }
}
