
import java.util.Scanner;

public class miniMaxProductsOfDistributedStores2064 {
    public static boolean isPossible(int[] arr, int stores, int minmx) {
        int tstores = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % minmx == 0)
                tstores += arr[i] / minmx;
            else
                tstores += arr[i] / minmx + 1;
        }
        if (tstores > stores)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stores : ");
        int stores = sc.nextInt();

        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(arr[i], mx);
        }

        int lo = 1;
        int hi = mx;
        int minmx = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(arr, stores, mid)) {
                minmx = mid;
                hi = mid - 1;
            } else
                lo = mid + 1;
        }

        System.out.print("minmx : " + minmx);

    }
}
