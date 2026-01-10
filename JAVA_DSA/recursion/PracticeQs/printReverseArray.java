
public class printReverseArray {
    public static void printArr(int[] arr, int i) {
        if (i == arr.length)
            return;
        printArr(arr, i + 1);
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        int[] arr = { 34, 3, 4, 5, 2, 5 };
        printArr(arr, 0);
    }
}
