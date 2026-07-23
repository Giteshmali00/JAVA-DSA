import java.util.HashMap;

public class maxNumOf_kMinusSum_pairs {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int rem = k - nums[i];
            if(map.containsKey(rem)){
                if(k%2==0 && (k/2) == rem){
                    count += map.get(rem)/2;
                }else{
                    count += Math.min(map.get(rem), map.get(nums[i]));
                }
                map.remove(nums[i]);
                map.remove(rem);
            }
        }

        return count;

    }

    static void main(String[] args) {
        int[] arr = {3,1,3,4,3};
        print(arr);
        int maxOp = maxOperations(arr,6);
        System.out.print("Maximum operations are : "+maxOp);
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
