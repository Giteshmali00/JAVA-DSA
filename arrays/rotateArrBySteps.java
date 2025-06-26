package arrays;

public class rotateArrBySteps {
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
        int k = 4;
        int[] rarr = new int[len];
        printArr(arr);

        int point = len - k;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (point < len) {
                rarr[i] = arr[point];
                point++;
            } else {
                rarr[i] = arr[j];
                j++;
            }
        }
        printArr(rarr);
    }
}
