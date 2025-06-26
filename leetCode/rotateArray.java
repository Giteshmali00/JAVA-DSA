package leetCode;

import java.util.Scanner;

public class rotateArray {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void rotate(int[] nums, int s, int e) {
        while (s <= e) {
            int temp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = temp;
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
        rotate(arr, 0, len - k - 1);
        rotate(arr, len - k, len - 1);
        rotate(arr, 0, len - 1);
        printArr(arr);
    }
}
