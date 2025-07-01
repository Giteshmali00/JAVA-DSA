package arrays;

public class nextGreastestEle {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 22, 48, 19, 670, 66, 60 };
        int n = arr.length;
        int[] ans = new int[n];

        // Method 1. Brute force
        // for (int i = 0; i < n - 1; i++) {
        // ans[i] = arr[i + 1];
        // for (int j = i + 2; j < n; j++) {
        // if (arr[j] > ans[i]) {
        // ans[i] = arr[j];
        // }
        // }
        // }
        // ans[n - 1] = -1;

        // Method 2. Optimised (Main Method)
        ans[n - 1] = -1;
        int nge = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        printArr(ans);
    }
}
