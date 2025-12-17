package LeetCode;

public class findDuplicateNumber287 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findDuplicate(int[] arr) {
        while (true) {
            if (arr[0] == arr[arr[0]])
                return arr[0];
            swap(arr, arr[0], 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1 };
        int dup = findDuplicate(arr);
        System.out.println(dup);
    }
}