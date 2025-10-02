package JAVA_DSA.Searching;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 12, 120, 299, 300, 565 };
        int n = arr.length;
        int target = 300;

        int lo = 0;
        int hi = n - 1;
        boolean found = false;
        int eleidx = -1;
        while (hi >= lo) {
            int mid = (hi + lo) / 2;
            if (target == arr[mid]) {
                found = true;
                eleidx = mid;
                break;
            } else if (target > arr[mid]) {
                lo = mid + 1;

            } else if (target < arr[mid]) {
                hi = mid - 1;
            }
        }
        if (found)
            System.out.print("Element found at index " + eleidx);
        else {
            System.out.print("Element not found");
        }

    }
}