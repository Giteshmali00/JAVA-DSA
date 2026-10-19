import java.util.Scanner;

public class _231_powerOfTwo {
    //Method 2 : Using recursion
    public static boolean isPowerOfTwo2(int n) {
        if(n==1) return true;
        if(n<=0 || n%2!=0) return false;
        return isPowerOfTwo(n/2);
    }
    //Method 1 : Using bitwise operator
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n-1)) == 0;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
