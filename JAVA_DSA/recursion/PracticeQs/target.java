package JAVA_DSA.recursion.PracticeQs;

import java.util.Scanner;

public class target {
    public static int find(int[] arr, int t, int i) {
        if (i == arr.length)
            return -1;
        if (arr[i] == t)
            return i;
        else
            return find(arr, t, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 32, 44, 56, 20 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target : ");
        int t = sc.nextInt();
        System.out.print(find(arr, t, 0));
    }
}
