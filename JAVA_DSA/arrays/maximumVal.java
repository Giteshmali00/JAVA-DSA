
import java.util.Scanner;

public class maximumVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ------- Method 1. --------
        // int max = arr[0];
        // for (int i = 1; i < n; i++) {
        // if (arr[i] > max)
        // max = arr[i];
        // }

        // ------- *Method 2. --------

    }
}
