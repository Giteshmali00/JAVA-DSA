
public class diffBetEvenSumAndOddSum {
    public static void main(String[] args) {
        int[] arr = { 70, 8, 9, 10, 20, 30, 40, 50, 79, 80 };
        int n = arr.length;

        int esum = 0, osum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                esum += arr[i];
            else
                osum += arr[i];
        }
        if (esum > osum)
            System.out.print("Sum Of Even Indices Elements is Greater Than Odd by " + (esum - osum));
        else if (esum < osum)
            System.out.print("Sum Of Odd Indices Elements is Greater Than Even by " + (osum - esum));
        else
            System.out.print("Both are Equal");
    }
}
