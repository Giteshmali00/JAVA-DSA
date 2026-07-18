import java.util.HashMap;

public class twoSum1 {
    //Method 2 : much better than Method 1
    public static int[] twoSum2(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target-nums[i])){
                ans[0] = hm.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }else hm.put(nums[i],i);
        }
        return ans;
    }
    //Method 1 :
    public static int[] twoSum(int[] nums, int target) {
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
        int[] arr = { 12, 8, 5, 9, 4 };
        int x = 12;
        System.out.print("Method 1 : "+twoSum(arr, x)[0] + " " + twoSum(arr, x)[1]);
        System.out.println();
        System.out.print("Method 2 much better than Method 1 : "+twoSum2(arr, x)[0] + " " + twoSum2(arr, x)[1]);
    }
}
