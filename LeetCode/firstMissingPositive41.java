package LeetCode;

public class firstMissingPositive41 {
    public static void print(int[] arr) {
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

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] < n && arr[i] > 0 && arr[arr[i] - 1] != arr[i])
                swap(arr, arr[i] - 1, i);
            else
                i++;
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, -1, 2 };
        print(arr);
        int ans = firstMissingPositive(arr);
        print(arr);
        System.out.println(ans);
    }
}
