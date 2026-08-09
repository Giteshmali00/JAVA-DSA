public class _1343_slidingWindowApproach {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int i = 1, j = 0, sum = 0, ans = 0;
        while(j<k){
            sum += arr[j++];
        }
        if(sum/k >= threshold)
            ans++;
        while(j < n){
            sum = sum - arr[i-1] + arr[j];
            if(sum/k >= threshold)
                ans++;
            i++; j++;
        }

        return ans;
    }

    static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3, threshold = 4;
        print(arr);
        System.out.println("Averages greater than or equal to threshold : "+numOfSubarrays(arr,k,threshold));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
