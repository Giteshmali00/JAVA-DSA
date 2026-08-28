import java.util.Arrays;
import java.util.Scanner;

public class _416_partitionEqualSubsetSum {
    public static boolean helper(int[] arr, int i, int sum, int[][] dp){
        if(sum==0) return true;
        if(i==arr.length) return false;
        if(dp[sum][i]!=-1) return dp[sum][i]==1;
        boolean skip = helper(arr,i+1,sum,dp);
        boolean ans = false;
        if(arr[i]>sum) ans = skip;
        else {
            boolean pick = helper(arr,i+1,sum-arr[i],dp);
            ans = pick || skip;
        }
        dp[sum][i] = ans? 1 : 0;
        return ans;
    }
    public static boolean canPartition(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        if(sum%2 != 0) return false;
        int[][] dp = new int[sum/2+1][n];
        for(int i = 0; i <= sum/2; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(arr,0,sum/2,dp);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.println("Can partition? : "+canPartition(arr));
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}
