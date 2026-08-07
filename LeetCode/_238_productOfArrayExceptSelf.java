public class _238_productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int suff = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            ans[i] *= suff;
            suff *= nums[i];
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        print(arr);
        System.out.print("Product of array except self : ");
        print(productExceptSelf(arr));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
