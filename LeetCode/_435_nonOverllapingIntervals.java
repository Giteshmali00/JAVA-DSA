import java.util.Arrays;

public class _435_nonOverllapingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->Integer.compare(a[1],b[1]));
        int count = 0;
        int i = 0, j = 1;
        while(j<intervals.length){
            if(intervals[i][1]>intervals[j][0]) count++;
            else i = j;
            j++;
        }
        return count;
    }
    static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        print(intervals);
        System.out.println("Minimum erased for making intervals non-overlapping : "+eraseOverlapIntervals(intervals));
    }

    private static void print(int[][] arr) {
        for(int[] a : arr){
            System.out.print("{"+a[0]+", "+a[1]+"} ");
        }
        System.out.println();
    }
}
