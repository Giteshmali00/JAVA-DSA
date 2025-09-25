package JAVA_DSA.sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 23, 25, 90, 95, 99, 100 };

        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                System.out.print("Array is not Sorted.");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("Array is Sorted.");
        }
    }
}
