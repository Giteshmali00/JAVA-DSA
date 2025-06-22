package arrays;

import java.util.Scanner;

public class sumOfAllElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements Of Array Seperated With Spaces :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.print("Sum of All Elements : " + sum);
    }
}
