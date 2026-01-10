
public class transposeSquareMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 3, 1, 2, 5 }, // 3,8,5,11//11,5,8,3//a00<->a03, a01<->a02
                { 8, 7, 9, 6 }, // 1,7,4,7//7,4,7,1//a10<->a13, a11<->a12
                { 5, 4, 6, 7 }, // 2,9,6,5//5,6,9,2//a20<->a23, a21<->a22
                { 11, 7, 5, 2 } // 5,6,7,2//2,7,6,5//a30<->a33, a31<->a32
        };

        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
