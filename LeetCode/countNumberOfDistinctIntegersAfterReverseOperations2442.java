import java.util.HashSet;

public class countNumberOfDistinctIntegersAfterReverseOperations2442 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = (rev*10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> s = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            s.add(nums[i]);
            s.add(reverse(nums[i]));
        }
        return s.size();
    }
    static void main(String[] args) {
        int[] arr = {1,13,10,12,31};
        print(arr);
        System.out.println("Number of Distinct Elements after reverse : "+countDistinctIntegers(arr));
    }
}
