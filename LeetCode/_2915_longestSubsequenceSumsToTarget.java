import java.util.Arrays;
import java.util.List;

public class _2915_longestSubsequenceSumsToTarget {
    public static int helper(List<Integer> nums, int target, int i, int[][] dp){
        if(target==0) return 0;
        if(i==nums.size()) return Integer.MIN_VALUE;
        if(dp[target][i]!=-1) return dp[target][i];
        int skip = helper(nums,target,i+1,dp);
        if(nums.get(i)>target) return dp[target][i] = skip;
        int pick = 1 + helper(nums,target-nums.get(i),i+1,dp);
        return dp[target][i] = Math.max(skip,pick);
    }
    public static int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int[][] dp = new int[target+1][n];
        for(int i = 0; i <= target; i++){
            Arrays.fill(dp[i],-1);
        }
        int count = helper(nums,target,0,dp);
        if(count<=0) return -1;
        return count;
    }

    static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int target = 9;
        System.out.println(nums);
        System.out.println("Target : "+target);
        System.out.println("Length of the Longest subsequence that sums to target : "+lengthOfLongestSubsequence(nums,target));
    }
}
