public class _303_rangeSumQueryImmutable {
    static class NumArray {
        int[] arr;

        public NumArray(int[] nums) {
            this.arr = nums;
            for (int i = 1; i < nums.length; i++) {
                arr[i] += arr[i-1];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0)
                return arr[right];
            return arr[right] - arr[left - 1];
        }
    }

    static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        print(arr);
        NumArray rs = new NumArray(arr);
        System.out.println("Range sum from 2 to 5 : "+rs.sumRange(2,5));

    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
