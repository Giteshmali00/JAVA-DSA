package JAVA_DSA.Searching;

//  Bakwass Methodd.........! 
// Main method is in LeetCode.searchInSortedArray33.java

public class searchInSortedArray33 {
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] arr, int x, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int n = arr.length;
        int tindx = -1;
        int x = 0;
        if (n <= 2) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == x)
                    tindx = i;
            }
            tindx = -1;
        }
        int lo = 1;
        int hi = n - 2;
        int p = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                p = mid;
                break;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                p = mid - 1;
                break;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                if (arr[mid] > arr[n - 1]) {
                    lo = mid + 1;
                } else if (arr[mid] < arr[n - 1]) {
                    hi = mid - 1;
                }
            }
        }
        if (p == -1) {
            tindx = binarySearch(arr, x, 0, n - 1);
            System.out.println("1st " + tindx);
        } else {
            int left = binarySearch(arr, x, 0, p);
            if (left == -1) {
                int right = binarySearch(arr, x, p + 1, n - 1);
                System.out.println("2nd " + right);
            } else
                System.out.print("3rd " + left);
        }

    }
}
