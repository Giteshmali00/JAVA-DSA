public class _209_minSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int i = 0, j = 0, sum = 0, minlen = Integer.MAX_VALUE;
        while(j < n){
            sum += arr[j];
            while(sum >= target){
                minlen = Math.min(minlen,j-i+1);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        if(minlen==Integer.MAX_VALUE)
            return 0;
        return minlen;
    }

    static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        print(arr);
        System.out.println("Target : "+target);
        System.out.println("Minimum array length : "+minSubArrayLen(target,arr));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
