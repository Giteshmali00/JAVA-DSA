package arrays;

public class mergeTwoSortedArraysM2 {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int[] brr, int[] crr) {
        int an = arr.length, bn = brr.length, cn = an + bn;
        int i = an - 1, j = bn - 1, k = cn - 1;
        while (i >= 0 && j >= 0) {
            if (arr[i] >= brr[j])
                crr[k--] = arr[i--];
            else
                crr[k--] = brr[j--];
        }
        while (i >= 0)
            crr[k--] = arr[i--];
        while (j >= 0)
            crr[k--] = brr[j--];

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 44, 54, 66, 75, 90, 102, 103, 104 };
        int[] brr = { 33, 42, 76, 77, 87, 98, 101, 102, 103, 104 };
        int[] crr = new int[arr.length + brr.length];

        merge(arr, brr, crr);
        printArr(crr);

    }
}