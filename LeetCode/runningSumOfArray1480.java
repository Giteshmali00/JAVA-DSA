public class runningSumOfArray1480 {
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i-1];
        return nums;
    }
    static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        System.out.print("Array : ");
        print(arr);
        System.out.print("Running sum of the array : ");
        print(runningSum(arr));

    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
