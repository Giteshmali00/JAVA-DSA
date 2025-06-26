package arrays;

public class sortArrayOfBinaryNums {
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
        int[] arr = { 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1 };
        int n = arr.length;
        int i = 0, j = n - 1;

        printArr(arr);
        while (i < j) {
            if (arr[i] == 0)
                i++;
            else if (arr[j] == 1)
                j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            } else {
                break;
            }
        }
        printArr(arr);
    }
}
