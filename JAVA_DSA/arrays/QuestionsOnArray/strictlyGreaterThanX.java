
import java.util.Scanner;

public class strictlyGreaterThanX {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = sc.nextInt();

        int[] arr = { 10, 25, 57, 23, 57, 555, 234, 2121, 77, 9, 4, 99 };
        int n = arr.length;

        int count = 0;
        printArr(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] > x)
                count++;
        }
        System.out.print("There are " + count + " Elements Strictly Greater Than " + x);
    }
}
