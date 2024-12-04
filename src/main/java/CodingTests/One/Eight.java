package CodingTests.One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Eight {
    public static void main(String[] args) {
        int[][] testData = generateTestData();
        System.out.println(Arrays.deepToString(testData));

        zeroMatrix(testData);
        System.out.println(Arrays.deepToString(testData));
    }

    private static boolean zeroMatrix(int[][] matrix) {
        if(Objects.isNull(matrix)) return false;
        List<Integer> zeroDetected = new ArrayList<>();
        int rowLength = matrix[0].length;
        for(int i=0; i<matrix.length; i++) {
            int[] currentRow = matrix[i];
            if (currentRow.length != rowLength) return false;
            for(int j=0; j<rowLength; j++){
                if(currentRow[j] == 0){
                    zeroDetected.add(i);
                    zeroDetected.add(j);
                }
            }
        }
        for(int i=0; i<zeroDetected.size(); i++){
            nulifyRow(matrix[zeroDetected.get(i)]);
            i++;
            nulifyColumn(matrix, zeroDetected.get(i));
        }
        return true;
    }

    private static void nulifyColumn(int[][] matrix, Integer integer) {
        for(int i=0; i<matrix.length; i++){
            matrix[i][integer]=0;
        }
    }

    private static void nulifyRow(int[] matrix) {
        Arrays.fill(matrix, 0);
    }

    private static int[][] generateTestData(){
        int[] firstRow = new int[]{1,2,3,4,5};
        int[] secondRow = new int[]{1,2,3,4,5};
        int[] thirdRow = new int[]{1,2,3,4,5};
        int[] fourthRow = new int[]{1,0,3,4,5};
        return new int[][]{firstRow, secondRow, thirdRow, fourthRow};
    }
}
