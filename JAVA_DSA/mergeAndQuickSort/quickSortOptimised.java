
public class quickSortOptimised {
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
        int mid = (lo + hi) / 2;
        int pivot = arr[mid], pidx = mid;
        int smc = 0;
        for (int i = lo; i <= hi; i++) {
            if (i == pidx)
                continue;
            if (arr[i] <= pivot)
                smc++;
        }
        int cidx = lo + smc;
        swap(arr, pidx, cidx);

        int i = lo, j = hi;
        while (i < cidx && j > cidx) {
            if (arr[i] < pivot)
                i++;
            else if (arr[j] > pivot)
                j--;
            else if (arr[i] > pivot && arr[j] < pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return cidx;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (hi <= lo)
            return;
        int pindex = partition(arr, lo, hi);
        quickSort(arr, lo, pindex - 1);
        quickSort(arr, pindex + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 30, 4, 29, 6, 7, 9 };
        print(arr);
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
