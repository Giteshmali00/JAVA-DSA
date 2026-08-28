import java.util.Arrays;
import java.util.Scanner;

public class subsetSumProblem {
    static boolean helper(int[] arr, int sum,int i,int[][] dp){
        if(sum==0) return true;
        if(i==arr.length) return false;
        if(dp[sum][i] != -1) return dp[sum][i]==1;
        boolean skip = helper(arr,sum,i+1,dp);
        boolean ans = false;
        if(arr[i]>sum) {
            ans = helper(arr,sum,i+1,dp);
        }else{
            boolean pick = helper(arr,sum-arr[i],i+1,dp);
            ans = skip || pick;
        }
        dp[sum][i] = ans ? 1 : 0;
        return ans;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        int[][] dp = new int[sum+1][arr.length];
        for(int i=0; i<=sum; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(arr,sum,0,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sum : ");
        int sum = sc.nextInt();
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("subset of arr[] with sum equal to given sum : "+isSubsetSum(arr,sum));

    }
}
