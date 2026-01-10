
public class minValueOfEle {
    public static void main(String[] args) {
        int[] arr = { 23, 33, 89, 20, 44 };
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Minimum Value in Array = " + min);
    }
}
