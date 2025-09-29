package LeetCode;

public class moveZeros283 {
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 77, 0, -34, 0, 2, -4, -6, 3 };
        printArray(arr);
        int k = 0;
        int i = 0;
        // int j = arr.length - 1;
        while (i < arr.length) {
            if (arr[i] == 0) {
                i++;
            } else {
                arr[k] = arr[i];
                i++;
                k++;
            }
        }
        printArray(arr);
        for (int r = k; r < arr.length; r++) {
            arr[r] = 0;
        }
        printArray(arr);
    }
}
