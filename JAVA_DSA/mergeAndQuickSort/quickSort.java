package JAVA_DSA.mergeAndQuickSort;

public class quickSort {
    public static void print(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo], pivotIdx = lo;
        int smc = 0;// 1/2/3
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot)
                smc++;
        }
        int cidx = pivotIdx + smc;
        swap(arr, pivotIdx, cidx);
        while (lo < cidx && hi > cidx) {
            if (arr[lo] < pivot) {
                lo++;
            } else if (arr[hi] > pivot)
                hi--;
            else {
                swap(arr, lo, hi);
                lo++;
                hi--;
            }

        }

        return cidx;
    }

    public static void quick_sort(int[] arr, int lo, int hi) {
        if (lo >= hi)
            return;
        int pivotIdx = partition(arr, lo, hi);
        quick_sort(arr, lo, pivotIdx - 1);
        quick_sort(arr, pivotIdx + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4, 5, 8, 6, 7 };
        int n = arr.length;
        print(arr);
        quick_sort(arr, 0, n - 1);
        print(arr);
    }
}
