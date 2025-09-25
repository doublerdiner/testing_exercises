package CodingPractice;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        Set<String> foundValues = new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                Character currentChar = board[i][j];
                if(currentChar == '.') continue;
                String row = String.format("row: %s value: %s", i, currentChar);
                String column = String.format("column: %s value: %s", j, currentChar);
                String square = String.format("square: %s-%s value: %s", i/3, j/3, currentChar);

                if(!foundValues.add(row) || !foundValues.add(column) || !foundValues.add(square)){
                    return false;
                }
            }
        }
        return true;
    }
}
