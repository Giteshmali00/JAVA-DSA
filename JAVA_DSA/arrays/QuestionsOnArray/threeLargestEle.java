
public class threeLargestEle {
    public static void main(String[] args) {
        int[] arr = { 7, 81, 69, 9, 20, 81, 40, 81, 79, 80 };
        int n = arr.length;

        int fst = Integer.MIN_VALUE, scd = fst, trd = scd;

        // Method 1. If non Reapited Elements are Count..
        for (int i = 0; i < n; i++) {
            if (arr[i] > fst) {
                trd = scd;
                scd = fst;
                fst = arr[i];
            } else if (arr[i] > scd && arr[i] != fst) {
                trd = scd;
                scd = arr[i];
            } else if (arr[i] > trd && arr[i] != scd && arr[i] != fst) {
                trd = arr[i];
            }
        }

        // Method 2. if Reapited Elements are count..
        // for (int i = 0; i < n; i++) {
        // int fidx = -1, sidx = -1;
        // if (arr[i] > fst) {
        // fst = arr[i];
        // fidx = i;
        // }
        // if (arr[i] > scd && (arr[i] != fst || i != fidx)) {
        // scd = arr[i];
        // sidx = i;
        // }
        // if (arr[i] > trd && (arr[i] != fst || i != fidx) && (arr[i] != scd || i !=
        // sidx)) {
        // trd = arr[i];
        // }
        // }
        System.out.print("Largest Three Elements in The Array : " + fst + " " + scd + " " + trd);
    }
}
