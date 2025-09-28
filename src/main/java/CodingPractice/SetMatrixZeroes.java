package CodingPractice;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] testArray = {
                {0,1,2,0},{3,4,5,2},{1,3,1,5}
        };
        setZeroes(testArray);
        System.out.println(Arrays.deepToString(testArray));
    }

    public static void setZeroes(int[][] array){
        boolean zeroInFirstRow = false;
        boolean zeroInFirstColumn = false;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                int currentNum = array[i][j];
                if(currentNum == 0 && i == 0){
                    zeroInFirstRow = true;
                }
                if(currentNum == 0 && j == 0){
                    zeroInFirstColumn = true;
                }
                if(currentNum == 0){
                    array[0][j] = 0;
                    array[i][0] = 0;
                }
            }
        }
        int rowLength = array[0].length;
        int columnLength = array.length;

        for(int i=1; i<array.length; i++){
            int rowLengthIndex = rowLength-1;
            int currentNum = array[i][0];
            if(currentNum == 0){
                while(rowLengthIndex > 0){
                    array[i][rowLengthIndex] = 0;
                    rowLengthIndex--;
                }
            }
        }

        for(int j=1; j<array[0].length; j++){
            int columnLengthIndex = columnLength-1;
            int currentNum = array[0][j];
            if(currentNum == 0){
                while(columnLengthIndex > 0){
                    array[columnLengthIndex][j] = 0;
                    columnLengthIndex--;
                }
            }

        }

        if(zeroInFirstRow){
            int rowLengthIndex = rowLength-1;
            while(rowLengthIndex>=0){
                array[0][rowLengthIndex] = 0;
                rowLengthIndex--;
            }
        }

        if(zeroInFirstColumn){
            int columnLengthIndex = columnLength-1;
            while(columnLengthIndex>=0){
                array[columnLengthIndex][0] = 0;
                columnLengthIndex--;
            }
        }

    }
}
