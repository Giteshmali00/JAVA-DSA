
import java.util.ArrayList;
import java.util.Collections;

public class findKSmallestEle658 {
    public static ArrayList<Integer> findClosestElement(int[] arr, int k, int x) {
        ArrayList<Integer> arrl = new ArrayList<>();
        int n = arr.length;

        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) {
                arrl.add(arr[i]);
            }
            return arrl;
        }
        if (x >= arr[n - 1]) {
            for (int i = n - k; i < n; i++) {
                arrl.add(arr[i]);
            }
            return arrl;
        }
        int lo = 0;
        int hi = n - 1;
        int lb = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x) {
                lb = mid;
                break;
            } else if (arr[mid] > x) {
                lb = Math.min(mid, lb);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        int i = lb - 1;
        int j = lb;
        while (k > 0 && i >= 0 && j < n) {
            int il = x - arr[i];
            int jl = arr[j] - x;
            if (il <= jl) {
                arrl.add(arr[i]);
                i--;
            } else {
                arrl.add(arr[j]);
                j++;
            }
            k--;
        }

        while (i < 0 && k > 0) {
            arrl.add(arr[j++]);
            k--;
        }
        while (j >= n && k > 0) {
            arrl.add(arr[i--]);
            k--;
        }
        Collections.sort(arrl);
        return arrl;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 2, 3, 6, 7, 8, 9 };
        int target = 4;
        int k = 9;
        System.out.println(findClosestElement(arr, k, target));
    }
}
