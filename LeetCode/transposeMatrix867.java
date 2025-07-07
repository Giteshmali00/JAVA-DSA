package LeetCode;

class transposeMatrix867 {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] trans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 12, 33, 44 },
                { 44, 88, 99 },
                { 65, 87, 98 },
                { 23, 90, 78 }
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] trans = transpose(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}