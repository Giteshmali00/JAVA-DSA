
public class quickSortDecresingOrder {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int lo, int hi) {
        int mid = (lo + hi) / 2;
        int pivot = arr[mid];
        int smc = 0;
        for (int i = lo; i <= hi; i++) {
            if (i == mid)
                continue;
            if (arr[i] < pivot)
                smc++;
        }
        int cidx = hi - smc;
        swap(arr, mid, cidx);
        int i = lo, j = hi;
        while (i < cidx && j > cidx) {
            if (arr[i] >= pivot)
                i++;
            else if (arr[j] < pivot)
                j--;
            else if (arr[i] < pivot && arr[j] >= pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return cidx;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi)
            return;
        int indx = partition(arr, lo, hi);
        quickSort(arr, lo, indx - 1);
        quickSort(arr, indx + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2, 6, 1, 7 };
        print(arr);
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}