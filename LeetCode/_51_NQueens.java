import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _51_NQueens {
    public static boolean isSafe(char[][] board, int row, int col){
        //Vertical Check
        for(int i = 0; i <= row; i++){
            if(board[i][col]=='Q') return false;
        }

        //Checking left digonal
        int maxLeft = Math.min(row,col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row-i][col-i]=='Q') return false;
        }

        //Checking right digonal
        int maxRight = Math.min(row,board.length-1-col);
        for(int i = 1; i <= maxRight; i++){
            if(board[row-i][col+i]=='Q') return false;
        }

        return true;
    }
    public static List<String> makeString(char[][] board){
        List<String> list = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            list.add(s);
        }
        return list;
    }
    public static void queens(char[][] board, List<List<String>> ans, int row){
        if(row==board.length){
            ans.add(makeString(board));
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                queens(board,ans,row+1);
                board[row][col] = '.';
            }
        }

    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i],'.');
        }
        queens(board,ans,0);
        return ans;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Queens : ");
        int n = sc.nextInt();
        System.out.println("Valid Baords : "+solveNQueens(n));
    }
}
