public class _1310_xorQueries {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] ans = new int[queries.length];
        for(int i = 1; i < n; i++){
            arr[i] ^= arr[i-1];
        }
        int i = 0;
        for(int[] query : queries){
            int start = query[0], end = query[1];
            ans[i] = arr[end];
            if(start > 0) ans[i] ^= arr[start-1];
            i++;
        }

        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        System.out.print("arr: ");
        print(arr);
        System.out.print("Queries: ");
        print(queries);
        int[] ans = xorQueries(arr,queries);
        System.out.print("Answer: ");
        print(ans);
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    private static void print(int[][] arr) {
        for(int[] a : arr){
            System.out.print("{"+a[0]+","+a[1]+"} ");
        }
        System.out.println();
    }
}
