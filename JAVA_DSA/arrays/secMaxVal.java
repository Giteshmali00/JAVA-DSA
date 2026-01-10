
import java.util.Scanner;

public class secMaxVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int smax = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (max != arr[i])
                smax = Math.max(smax, arr[i]);
        }

        System.out.println("Maximum Value = " + max);
        System.out.print("Second Maximum Value = " + smax);
    }
}
