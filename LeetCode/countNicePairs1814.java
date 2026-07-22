import java.util.HashMap;

public class countNicePairs1814 {
    public static int rev(int num){
        int ans = 0;
        while(num!=0){
            ans = ans*10 + num%10;
            num /= 10;
        }
        return ans;
    }
    public static int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        int MOD = 1000000007;
        for(int i = 0; i < nums.length; i++){
            int key = nums[i]-rev(nums[i]);
            map.put(key,map.getOrDefault(key,-1)+1);
            ans = (ans + map.get(key));
        }

        return (int)(ans % MOD);
    }

    static void main(String[] args) {
        int[] arr = {13,10,35,24,76};
        print(arr);
        System.out.print("There is "+countNicePairs(arr)+" Pairs found in the array");
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
