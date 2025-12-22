package LeetCode;

public class setMismatch645 {
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

    public static int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i + 1 || arr[arr[i] - 1] == arr[i])
                i++;
            else
                swap(arr, arr[i] - 1, i);
        }
        int[] ans = new int[2];
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                ans[0] = arr[i];
                ans[1] = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        int[] ans = findErrorNums(arr);
        print(ans);

    }
}
