public class _713_subArrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k <= 1) return 0;
        int i = 0, j = 0, prdct = 1, count = 0;
        while(j < arr.length){
            prdct *= arr[j];
            while(prdct >= k){// 1, 2, 2, 3,
                prdct /= arr[i++];
            }
            count += j-i+1;
            j++;
        }
        return count;
    }

    static void main(String[] args) {
        int[] arr = {10, 5, 2, 6, 3, 5};
        int k = 100;
        print(arr);
        System.out.println("K = "+k);
        System.out.println("Number of contiguous subarrays where" +
                " the product of all the elements in the subarray" +
                " is strictly less than 'k' is : "
                +numSubarrayProductLessThanK(arr,k));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
