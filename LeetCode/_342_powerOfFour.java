import java.util.Scanner;

public class _342_powerOfFour {
    public static boolean isPerfectSquare(int n) {
        int root = (int)Math.sqrt(n);
        return root * root == n;
    }
    public static boolean isPowerOfFour(int n) {
        return (n>0) && ((n & (n-1)) == 0) && isPerfectSquare(n);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }
}
