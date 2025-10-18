package JAVA_DSA.Searching;

public class peakIndex {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 1;
        int hi = n - 2;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid + 1]) {
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                } else
                    hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 36, 26, 22, 20 };
        int peak = peakIndexInMountainArray(arr);
        System.out.print("Peak : " + peak);
    }
}
