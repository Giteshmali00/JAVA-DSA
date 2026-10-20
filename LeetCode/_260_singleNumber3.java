public class _260_singleNumber3 {
    public static int[] singleNumber(int[] nums) {
        int xorOfNums = 0;
        for(int ele : nums){
            xorOfNums ^= ele;
        }
        int rightBitOff = xorOfNums & (xorOfNums-1);
        int mask = rightBitOff ^ xorOfNums;
        int[] ans = new int[2];
        for(int ele : nums){
            if((ele&mask) == 0)
                ans[0] ^= ele;
            else
                ans[1] ^= ele;
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};
        print(arr);
        int[] ans = singleNumber(arr);
        System.out.println("Unique numbers: "+ans[0]+" "+ans[1]);
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
