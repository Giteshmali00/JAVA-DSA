import java.util.Arrays;

public class _2389_longestSubSequenceWithLimitedSum {
    public int binarySearch(int[] arr, int target) {
        if (target < arr[0])
            return 0;
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid + 1;
            else if (arr[mid] < target) {
                if (arr[mid + 1] > target)
                    return mid + 1;
                left = mid + 1;
            } else {
                if(arr[mid - 1] < target)
                    return mid;
                right = mid - 1;
            }
        }
        return n;
    }

    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < m; i++) {
            ans[i] = binarySearch(nums, queries[i]);
        }

        return ans;
    }

    static void main(String[] args) {

    }
}
