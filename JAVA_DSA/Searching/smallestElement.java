import java.util.Scanner;

public class smallestElement {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr));

    }

    private static int answer(int[] arr) {
        int n = arr.length;//17 18 19 20 1 2 3 4 6
        int lo = 0, hi = n-1;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
                return mid;
            else if(arr[mid] < arr[lo]){
                if(arr[mid] > arr[mid-1]) hi = mid - 1;
                else lo = mid + 1;
            }else {
                if(arr[mid] > arr[mid-1]) lo = mid+1;
                else hi = mid-1;
            }
        }
        return 0;
    }

}
