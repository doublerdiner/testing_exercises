package CodingPractice;

import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] grid = {{'X','O','X','X'},{'X','O','X','X'},{'X','X','O','X'},{'X','X','X','X'}};
        clearSurroundedRegions(grid);
        System.out.println(Arrays.deepToString(grid));
    }

    private static void clearSurroundedRegions(char[][] board) {
        if(board == null || board.length == 0){
            return;
        }

        int height = board.length;
        int length = board[0].length;

        for(int i=0; i<height; i++){
            dfs(board, i, 0);
            dfs(board, i, length-1);
        }

        for(int j=0; j<length; j++){
            dfs(board, 0, j);
            dfs(board, height-1, j);
        }

        for(int n=0; n<height; n++){
            for(int m=0; m<length; m++){
                if(board[n][m] == 'O'){
                    board[n][m] = 'X';
                }
                else if(board[n][m] == 'T'){
                    board[n][m] = 'O';
                }
            }
        }
    }

    private static void dfs(char[][] board, int i, int j){
        int height = board.length;
        int length = board[0].length;
        if(i < 0 || i >= height || j < 0 || j >= length || board[i][j] != 'O'){
            return;
        }

        board[i][j] = 'T';

        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }
}
