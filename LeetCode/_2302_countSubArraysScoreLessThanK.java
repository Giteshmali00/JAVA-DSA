public class _2302_countSubArraysScoreLessThanK {
    public static long countSubarrays(int[] arr, long k) {
        long sum = 0, ans = 0;
        for(int j = 0, i = 0; j < arr.length; j++){
            sum += arr[j];
            while(sum * (j - i + 1) >= k){
                sum -= arr[i++];
            }
            ans += (j - i + 1);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {2,1,4,3,5};
        int k = 10;
        print(arr);
        System.out.println("K = "+k);
        System.out.println("Total number of Sub Arrays with score less than k : "+countSubarrays(arr,k));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
