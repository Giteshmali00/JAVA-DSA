
import java.util.Scanner;

public class missingSmallestPtiveNum {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArr(arr);
        int j = 1;
        boolean found = false;
        int sele = 0;
        if (arr[n - 1] <= 0)
            sele = 1;
        else {
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    if (arr[i] != j++) {
                        sele = j - 1;
                        found = true;
                        break;
                    }
                }
            }
            if (!found)
                sele = arr[n - 1] + 1;
        }

        System.out.print("Smallest Missing Positive Element is " + sele);

    }
}
