
public class selectionSort {
    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 9, 10, 32, 100 };
        printArray(arr);
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = arr[i];
            int mindx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
                count++;
            }
            int temp = arr[mindx];
            arr[mindx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(count);
        printArray(arr);
    }
}
