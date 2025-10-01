package JAVA_DSA.sorting;

public class nDistinctElements {
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 40, 63, 44, 23, 66, 29 };
        int n = arr.length;

        int x = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * -1;
        }
        printArray(arr);
    }
}
