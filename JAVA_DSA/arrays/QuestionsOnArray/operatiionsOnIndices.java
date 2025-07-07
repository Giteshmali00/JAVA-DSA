package JAVA_DSA.arrays.QuestionsOnArray;

public class operatiionsOnIndices {
    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 70, 8, 9, 10, 20, 30, 40, 50, 79, 80 };
        int n = arr.length;

        printArr(arr);
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0)
                arr[i] *= 2;
            else
                arr[i] += 10;
        }
        printArr(arr);
    }
}
