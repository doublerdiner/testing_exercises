package CodingPractice;

import java.util.Arrays;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] testBoard = {
                {0,1,0},{0,0,1},{1,1,1},{0,0,0}
        };
        playGameOfLife(testBoard);
        System.out.println(Arrays.deepToString(testBoard));

    }

    private static void playGameOfLife(int[][] board) {

        int[][] positionKey = {
                {-1,-1},{-1,0},{-1,1},
                {0,-1},{0,1},
                {1,-1},{1,0},{1,1}
        };
        int numOfRows = board.length;
        int rowLength = board[0].length;

        for(int i=0; i<numOfRows; i++){
            for (int j=0; j<rowLength; j++){
                int neighbours = 0;

                for(int[] dir : positionKey){
                    int x = dir[0] + i;
                    int y = dir[1] + j;
                    if(x>=0 && y>=0 && x<numOfRows && y<rowLength && Math.abs(board[x][y]) == 1){
                        neighbours++;
                    }
                }

                if(board[i][j] == 1){
                    if(neighbours < 2 || neighbours > 3){
                        board[i][j] = -1;
                    }
                }
                else{
                    if(neighbours == 3){
                        board[i][j] = 2;
                    }
                }
            }
        }

        for(int i=0; i<numOfRows; i++){
            for (int j=0; j<rowLength; j++){
                if(board[i][j] > 0){
                    board[i][j] = 1;
                }
                else{
                    board[i][j] = 0;
                }
            }
        }
    }
}
