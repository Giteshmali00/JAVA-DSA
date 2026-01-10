
public class checkArraySortedON {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 10, 20, 30, 40, 50, 79, 80 };
        int n = arr.length;

        boolean srtd = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                srtd = false;
                break;
            }

        }
        if (srtd)
            System.out.println("Array is Sorted.");
        else
            System.out.println("Array isn't Sorted.");
    }
}
