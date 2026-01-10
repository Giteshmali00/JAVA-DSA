
public class secondLargestEle {
    public static void main(String[] args) {
        int[] arr = { 23, 33, 89, 23, 44 };
        int n = arr.length;
        int mx = Integer.MIN_VALUE, smx = mx;

        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > smx && arr[i] != mx) {
                smx = arr[i];
            }
        }
        System.out.print("Second Maximum = " + smx);
    }
}
