
public class bubbleSort {
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int ele1, int ele2) {
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }

    public static void arrayBubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean check = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    check = false;
                }
                count++;
            }
            if (check)
                break;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 230, 210, 100, 95, 90, 10 };

        printArray(arr);
        arrayBubbleSort(arr);
        printArray(arr);
    }
}
