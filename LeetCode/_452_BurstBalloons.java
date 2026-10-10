import java.util.Arrays;

public class _452_BurstBalloons {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a, b)->Integer.compare(a[0], b[0]));
        int arrows = 1;
        int n = points.length;
        int minEnd = points[0][1];
        for(int i = 1; i < n; i++){
            if(points[i][0]>points[i-1][1] || minEnd<points[i][0]){
                arrows++;
                minEnd = points[i][1];
            }
            else{
                minEnd = Math.min(minEnd,points[i][1]);
            }
        }
        return arrows;
    }
    static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        print(points);
        System.out.println("Minimum Arrows to burst balloon is : "+findMinArrowShots(points));
    }
    private static void print(int[][] arr) {
        for(int[] a : arr){
            System.out.print("{"+a[0]+", "+a[1]+"} ");
        }
        System.out.println();
    }
}
