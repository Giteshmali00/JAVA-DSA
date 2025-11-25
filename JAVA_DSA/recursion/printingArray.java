package JAVA_DSA.recursion;

public class printingArray {
    public static void print(int[] arr, int i) {
        if (arr.length <= i) {
            return;
        }
        System.out.println(arr[i] + " ");
        print(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 6, 3, 8, 9 };
        print(arr, 0);
    }
}
