import java.util.HashMap;

public class _560_subarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i = 1; i < n; i++){
            nums[i] += nums[i-1];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele : nums) {
            if (ele == k)
                ans++;
            ans += map.getOrDefault(ele - k, 0);
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,2,4,3,-3,0,7,8,-1};
        int k = 7;
        print(arr);
        System.out.println("Total number of sub array sum : "+subarraySum(arr,k));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
