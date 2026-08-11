public class _1493_longestSubarrayOf1ns {
    public static int longestSubarray(int[] arr) {
        int n = arr.length, i = 0, j = 0, maxlen = 0;
        while(j < n){
            while(i < n && arr[i] != 1){
                i++;//Reach-out to your window's left side.
            }
            //Check if j is already next to the 1st zero of next window then don't pull j to back, move forward j from its current point
            if(j <= i) j = i;
            else j--;
            int z = 0, fzidx = 0;
            while(j < n && z < 2){
                if(arr[j]==0){
                    if(z==0){
                        fzidx = j;//first zero of current window
                    }
                    z++;//calculating number of zeros in current window.
                }
                j++;//Reach-out to your window's right side.
            }
            if(i==0 && j==n && z==0) return n-1;//Special case for all 1's.
            maxlen = Math.max(maxlen,j - i - z);//Calculating max length between current window and previous max window.
            i = fzidx+1;//Put i next to the first zero of current window.
        }

        return maxlen;
    }

    static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        print(arr);
        System.out.println("Longest sub array after deleting one element : "+longestSubarray(arr));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
