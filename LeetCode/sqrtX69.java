
public class sqrtX69 {
    public static int mySqrt(int x) {
        // return (int)Math.sqrt(x); //newton raphson method -> fastest method
        long lo = 0;
        long hi = x;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid == (long) x)
                return (int) mid;
            else if (mid * mid > (long) x)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return (int) hi;

    }

    public static void main(String[] args) {
        int sqrt = mySqrt(18);
        System.out.print("Rounded Square root is : " + sqrt);
    }
}
