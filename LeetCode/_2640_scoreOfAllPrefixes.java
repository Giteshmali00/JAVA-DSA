public class _2640_scoreOfAllPrefixes {
    public static long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        int max = nums[0];
        ans[0] = nums[0]*2;
        for(int i = 1; i < n; i++){
            max = Math.max(max,nums[i]);
            ans[i] = ans[i-1] + (nums[i] + max);
        }

        return ans;
    }

    static void main(String[] args) {
        int[] arr = {2,3,7,5,10};
        print(arr);
        System.out.print("Prefix Score : ");
        print(findPrefixScore(arr));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    private static void print(long[] arr) {
        for(long ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
