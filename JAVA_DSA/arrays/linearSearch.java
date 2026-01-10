
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target Element : ");
        int x = sc.nextInt();

        boolean flag = false;
        int ele = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                ele = i;
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.print("Element Found at Index " + ele);
        else
            System.out.print("Element not Found.");
    }
}
