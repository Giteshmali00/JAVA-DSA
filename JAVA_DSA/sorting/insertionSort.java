package JAVA_DSA.sorting;

public class insertionSort {
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 10, 50, 10, 8, 5, 3 };
        int n = arr.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else
                    break;
                count++;
            }
        }
        System.out.println(count);
        printArray(arr);
    }
}
