package LinkedInCourseTests;

import java.util.Arrays;

public class TwoDimensionalArray {

    public int diagonalCalculation(int[][] numberArray){
        int total = 0;
        for(int i=0; i<numberArray.length; i++){
            total += numberArray[i][i];
        }
        return total;
    }

    public boolean canRookAttack(int[][] chessBoard){
        for(int i=0; i<chessBoard.length; i++){
            int rowTotal = 0;
            for(int j=0; j<chessBoard[i].length; j++){
                rowTotal += chessBoard[i][j];
                if(rowTotal>1){
                    return true;
                }
            }
        }
        for(int i=0; i<chessBoard.length; i++){
            int columnTotal = 0;
            for(int j=0; j<chessBoard.length; j++){
                columnTotal += chessBoard[j][i];
                if(columnTotal > 1){
                    return true;
                }
            }
        }
        return false;
    }

    private int countNegatives(int[][] negatives) {
        int total = 0;
        for(int i=0; i<negatives.length; i++){
            for(int j=0; j<negatives.length; j++){
                int currentNumber = negatives[i][j];
                if(currentNumber >= 0){
                    break;
                }
                else{
                    total++;
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Question 1: ");
        int[][] a2d = new int[][]{{1, 2, 3}, {5, 6, 7}};
        System.out.println("a2d is: ");
        for(int[] array : a2d){
            System.out.println(Arrays.toString(array));
        }

        System.out.println("\nQuestion 2: ");
        int[][] b2d = new int[][]{{1, 2, 3}, {5, 6, 7}};
        b2d[1][1] = 99;
        System.out.println(Arrays.toString(b2d[1]));

        System.out.println("\nQuestion 3: ");
        String[][] c2d = new String[][]{{"a", "b", "c"}, {"x", "y", "z"}};
        for(String[] row: c2d){
            for(String item: row) {
                System.out.println(item);
            }
        }

        System.out.println("\nQuestion 4: ");
        String[][] d2d = new String[][]{{"a", "b", "c"}, {"x", "y", "z"}};
        for(int i=0; i<d2d.length; i++){
            for(int j=0; j<d2d[i].length; j++){
                System.out.println(d2d[i][j]);
            }
        }

        System.out.println("\nQuestion 5: ");
        int[][] given2d = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        System.out.println(twoDimensionalArray.diagonalCalculation(given2d));

        System.out.println("\nQuestion 6: ");
        int[][] chessBoardFalse = new int[][]{{0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}};
        int[][] chessBoardTrue = new int[][]{{1, 1}, {0, 0}};
        int[][] chessBoardTrue2 = new int[][]{{1, 0}, {1, 0}};
        System.out.println(twoDimensionalArray.canRookAttack(chessBoardFalse));
        System.out.println(twoDimensionalArray.canRookAttack(chessBoardTrue));
        System.out.println(twoDimensionalArray.canRookAttack(chessBoardTrue2));

        System.out.println("\nQuestion 7: ");
        int[][] negatives = new int[][]{{-4, -3, -1, 0}, {-2, -2, 1, 2}, {-1, 1, 2, 3}, {1, 2, 4, 5}};
        System.out.println(twoDimensionalArray.countNegatives(negatives));

    }




}
