public class _1109_corporateFlightBookings {
    public static int[] corpFlightBookings(int[][] arr, int n) {
        int[] ans = new int[n];
        for (int[] flight : arr) {
            int j = flight[0], k = flight[1];
            ans[j - 1] += flight[2];
            if (k < n)
                ans[k] -= flight[2];
        }
        for(int i = 1; i < n; i++){
            ans[i] += ans[i-1];
        }

        return ans;
    }

    static void main(String[] args) {
        int[][] arr = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        print(arr);
        System.out.print("Corporate Flight bookings for 5 days : ");
        print(corpFlightBookings(arr,n));
    }

    private static void print(int[][] arr) {
        for(int[] flight : arr){
            for(int ele : flight){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
