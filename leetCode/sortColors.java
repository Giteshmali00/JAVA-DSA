package leetCode;

public class sortColors {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0, 2, 1, 0, 0, 2, 1, 1, 2, 2 };
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int hi = n - 1;

        printArr(arr);
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 1)
                mid++;
            else if (arr[mid] == 2) {
                swap(arr, mid, hi--);
            } else
                break;
        }
        printArr(arr);
    }
}
