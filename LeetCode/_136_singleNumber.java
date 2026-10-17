public class _136_singleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int ele : nums){
            ans ^= ele;
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        print(arr);
        System.out.println("Single number: "+singleNumber(arr));
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
