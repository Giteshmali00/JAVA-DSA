public class _724_findPivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++)
            nums[i] += nums[i-1];

        if(nums[n-1]-nums[0]==0)
            return 0;

        for(int i = 1; i < n; i++)
            if(nums[n-1] - nums[i]==nums[i-1])
                return i;

        return -1;
    }

    static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        print(arr);
        System.out.println("Pivot index is : "+pivotIndex(arr));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
