import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_mergeIntervals {
    public static int[][] merge(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr,(a1, a2)->a1[0] - a2[0]);
        List<int[]> ans = new ArrayList<>();
        for(int[] a : arr){
            int j = ans.size()-1;
            if(j<0 || a[0] > ans.get(j)[1]){
                ans.add(a);
            }else {
                ans.get(j)[1] = Math.max(a[1],ans.get(j)[1]);
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }

    static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        print(intervals);
        intervals = merge(intervals);
        System.out.println("Merged overlapping intervals:");
        print(intervals);
    }

    private static void print(int[][] arr) {
        for(int[] a : arr){
            System.out.print("{"+a[0]+", "+a[1]+"} ");
        }
        System.out.println();
    }
}
