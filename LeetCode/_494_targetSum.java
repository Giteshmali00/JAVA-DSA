import java.util.Arrays;
import java.util.Scanner;

public class _494_targetSum {
    static int sum;
    public static int helper(int[] arr, int target, int i, int[][] dp, int res){
        if(i==arr.length){
            if(target==res) return 1;
            return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int add = helper(arr,target,i+1,dp,res-arr[i]);
        int sub = helper(arr,target,i+1,dp,res+arr[i]);
        return dp[i][res+sum] = add + sub;
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        int[][] dp = new int[n][sum*2+1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums,target,0,dp,0);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        System.out.print("Enter size of the arrays : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter arrays elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.println("Target : "+target);
        System.out.println("total number of different expressions : "+findTargetSumWays(arr,target));

    }

    private static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
