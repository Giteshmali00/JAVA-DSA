
import java.util.Scanner;

public class stairPath {
    public static int ways(int n) {
        if (n <= 2 && n != 0)
            return n;
        if (n == 0)
            return 1;
        return ways(n - 1) + ways(n - 2) + ways(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int tWays = ways(n);
        System.out.println(tWays);
    }
}
