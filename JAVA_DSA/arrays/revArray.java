public class revArray {
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
        int[] arr = { 10, 20, 30, 50, 60, 70 };
        int len = arr.length;

        printArr(arr);

        int i = 0, j = len - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        printArr(arr);
    }
}
