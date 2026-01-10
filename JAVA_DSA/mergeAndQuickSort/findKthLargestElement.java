
public class findKthLargestElement {
    static int ans;

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
            if (arr[i] <= pivot)
                i++;
            else if (arr[j] > pivot)
                j--;
            else if (arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return cidx;
    }

    public static void quickSelect(int[] arr, int lo, int hi, int k) {
        if (lo > hi) {
            return;
        }
        // if (lo == hi) { // Not really required
        // if (lo == k - 1)
        // ans = arr[lo];
        // return;
        // }
        int pindex = partition(arr, lo, hi);
        if (pindex == k - 1) {
            ans = arr[pindex];
            return;
        }

        if (k - 1 < pindex)
            quickSelect(arr, lo, pindex - 1, k);
        else
            quickSelect(arr, pindex + 1, hi, k);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int n = arr.length;
        print(arr);
        int k = 9;
        ans = -1;
        quickSelect(arr, 0, n - 1, n - k + 1);
        System.out.println(ans);
    }
}
