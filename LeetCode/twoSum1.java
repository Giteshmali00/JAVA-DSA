package LeetCode;

public class twoSum1 {
    public static int[] twoSumm(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 8, 8, 5, 9, 4 };
        int x = 12;
        System.out.print(twoSumm(arr, x)[0] + " " + twoSumm(arr, x)[1]);
    }
}
