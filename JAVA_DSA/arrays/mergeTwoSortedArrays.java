
public class mergeTwoSortedArrays {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int[] brr, int[] crr) {
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] <= brr[j]) {
                crr[k++] = arr[i++];
            } else
                crr[k++] = brr[j++];
        }
        while (i < arr.length)
            crr[k++] = arr[i++];
        while (j < brr.length)
            crr[k++] = brr[j++];

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 44, 54, 66, 75, 90, 102, 103, 104 };
        int[] brr = { 33, 42, 76, 77, 87, 98, 101, 102, 103, 104 };
        int an = arr.length;
        int bn = brr.length;

        int[] crr = new int[an + bn];

        merge(arr, brr, crr);
        printArr(crr);
    }
}
