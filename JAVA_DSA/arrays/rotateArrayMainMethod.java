
import java.util.Scanner;

public class rotateArrayMainMethod {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void rotateArray(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int len = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Steps : ");
        int k = sc.nextInt();
        k = k % len;
        printArr(arr);
        rotateArray(arr, 0, len - k - 1);
        rotateArray(arr, len - k, len - 1);
        rotateArray(arr, 0, len - 1);
        printArr(arr);
    }
}
