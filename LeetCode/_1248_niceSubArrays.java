import java.util.HashMap;

public class _1248_niceSubArrays {
    //Method 1: Own
    public static int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        for(int j=0, i=0, l=0, odd=0; j < nums.length; j++){
            if(nums[j]%2!=0) {
                odd++;
                if(odd==1){
                    l = j;
                }
            }
            if(odd > k){
                i = ++l;
                while(nums[l]%2==0){
                    l++;
                }
                odd--;
            }
            if(odd == k){
                count += l-i+1;
            }
        }
        return count;
    }
    //Method 2: Raghav garg
    public static int numberOfSubarrays2(int[] arr, int k) {
        int i = 0, j = 0, a = 0, b = 0, count = 0, k2 = 0, n = arr.length;
        while(i < n && arr[i]%2==0) i++;
        while(j < n && k2 < k)
            if(arr[j++]%2!=0) k2++;
        if(k2 < k) return 0;
        j--;
        b = j + 1;
        while(b < n && arr[b]%2==0)
            b++;
        b--;

        while(b < n){
            count += (i-a+1)*(b-j+1);
            a = ++i;
            while(i < n && arr[i]%2==0) i++;
            j = b+1;
            b = j+1;
            while(b < n && arr[b]%2==0) b++;
            b--;
        }
        return count;
    }
    //Method 3 : Using Hashmap and Prefix sum
    public static int numberOfSubarrays3(int[] arr, int k) {
        int n = arr.length, count = 0;
        for(int i = 0; i < n; i++) arr[i] %= 2;
        for(int i = 1; i < n; i++) arr[i] += arr[i-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],i);
            int a = 0;
            if(map.containsKey(arr[i]-k)) a = map.get(arr[i] - k);
            int b = 0;
            if(map.containsKey(arr[i]-k+1)) b = map.get(arr[i] - k + 1);
            if(arr[i]==k) count += (b-a+1);//c = 8
            if(arr[i]>k) count += (b-a);
        }
        return count;
    }

    static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,1,2,2,2,1,2};
        int k = 3;
        print(arr);
        System.out.println("K = "+k);
        System.out.println("Number of sub arrays contains k odd numbers : "+numberOfSubarrays(arr,k));
        System.out.println("Number of sub arrays contains k odd numbers : "+numberOfSubarrays2(arr,k));
        System.out.println("Number of sub arrays contains k odd numbers : "+numberOfSubarrays3(arr,k));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
