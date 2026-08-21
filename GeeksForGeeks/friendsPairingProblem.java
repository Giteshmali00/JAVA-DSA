import java.util.Arrays;
import java.util.Scanner;

public class friendsPairingProblem {
    public static int pairing(int n) {
        // code here
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){//f(n) = f(n-1) + (n-1)*f(n-2);
            dp[i] = dp[i-1] + ((i)*dp[i-2]);
        }
        return dp[n-1];
    }
    public static int pairing(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = pairing(n-1,dp) + (n-1) * pairing(n-2,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
//        System.out.println("Total Pairings : "+pairing(n,dp));
        System.out.println("Total Pairings : "+pairing(n));
    }
}
