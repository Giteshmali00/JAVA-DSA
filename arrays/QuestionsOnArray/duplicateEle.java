package arrays.QuestionsOnArray;

public class duplicateEle {
    public static void main(String[] args) {
        int[] arr = { 23, 33, 89, 23, 44, 89 };
        int n = arr.length;

        System.out.print("Duplicate Elements in the Given Array : ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
