
public class spiralPrint {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 }
        };

        int m = arr.length;
        int n = arr[0].length;

        int minc = 0, maxc = n - 1;// 4
        int minr = 0, maxr = m - 1;// 5
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
            if (minr > maxr || minc > maxc)
                break;
            for (int j = minr; j <= maxr; j++) {
                System.out.print(arr[j][maxc] + " ");
            }
            maxc--;
            if (minr > maxr || minc > maxc)
                break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            }
            maxr--;
            if (minr > maxr || minc > maxc)
                break;
            for (int j = maxr; j >= minr; j--) {
                System.out.print(arr[j][minc] + " ");
            }
            minc++;
            if (minr > maxr || minc > maxc)
                break;
            System.out.println();
        }
    }
}
