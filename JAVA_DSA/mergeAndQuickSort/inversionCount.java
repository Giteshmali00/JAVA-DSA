package JAVA_DSA.mergeAndQuickSort;

public class inversionCount {
    static int count;

    public static void print(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else {
                count += (a.length - i);
                c[k++] = b[j++];
            }

        }

        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];
    }

    // public static void inversion(int[] a, int[] b) {
    // int i = 0, j = 0;
    // while (i < a.length && j < b.length) {
    // if (a[i] > b[j]) {
    // count += (a.length - i);
    // j++;
    // } else
    // i++;
    // }
    // }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++)
            a[i] = arr[i];
        for (int i = 0; i < n - n / 2; i++)
            b[i] = arr[i + n / 2];

        // These functions divides the Arrays in two parts
        mergeSort(a);
        mergeSort(b);

        // This is a inversion count function
        // inversion(a, b);
        // This work is basically done by the merge() function
        // by just adding one line which is => count += (a.length - i); in the else
        // condition

        // This function is merge Two Sorted Arrays
        merge(a, b, arr);
        a = null;
        b = null;
    }

    public static void main(String[] args) {
        int[] arr = { 109, 33, 89, 27, 60, 10, 70 };
        print(arr);
        mergeSort(arr);
        print(arr);
        System.out.println(count);
    }
}
