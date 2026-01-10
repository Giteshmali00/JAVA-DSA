
import java.util.ArrayList;
import java.util.List;

public class spiralMatrix54 {
    public static void main(String[] args) {
        int[][] arr = {
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        int m = arr.length;
        int n = arr[0].length;

        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        List<Integer> l = new ArrayList<>();
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {
                l.add(arr[minr][j]);
            }
            minr++;
            if (minr > maxr || minc > maxc)
                break;
            for (int j = minr; j <= maxr; j++) {
                l.add(arr[j][maxc]);
            }
            maxc--;
            if (minr > maxr || minc > maxc)
                break;
            for (int j = maxc; j >= minc; j--) {
                l.add(arr[maxr][j]);
            }
            maxr--;
            if (minr > maxr || minc > maxc)
                break;
            for (int j = maxr; j >= minr; j--) {
                l.add(arr[j][minc]);
            }
            minc++;
            if (minr > maxr || minc > maxc)
                break;
        }
        System.out.print(l);
    }
}
