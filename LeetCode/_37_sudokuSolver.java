public class _37_sudokuSolver {
    public static boolean isValid(char[][] board, int row, int col, char ch){
        //Checking rows and columns
        for(int i = 0; i <= 8; i++){
            if(board[row][i]==ch) return false;
            if(board[i][col]==ch) return false;
        }

        //Checking 3*3 grid
        int startRow = (row/3) * 3;
        int startCol = (col/3) * 3;
        for(int i = startRow; i < startRow+3; i++){
            for(int j = startCol; j < startCol+3; j++){
                if(board[i][j]==ch) return false;
            }
        }

        return true;

    }
    public static boolean sudoku(char[][] board){
        for(int i = 0; i <= 8; i++){
            for(int j = 0; j <= 8; j++){
                if(board[i][j]=='.'){
                    for(char c = '1'; c <= '9'; c++){
                        if(isValid(board,i,j,c)){
                            board[i][j] = c;
                            if(sudoku(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void solveSudoku(char[][] board) {
        sudoku(board);
    }

    static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        print(board);
        solveSudoku(board);
        print(board);
    }
    public static void print(char[][] board){
        for (char[] c : board){
            for(char ch : c){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
