package CodingPractice;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] testMatrix = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        int[][] testMatrix2 = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };
        System.out.println(spiralOrder(testMatrix));
        System.out.println(spiralOrder(testMatrix2));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> response = new ArrayList<>();

        if(matrix.length == 0) {
            return response;
        }

        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                response.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                response.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    response.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    response.add(matrix[i][left]);
                }
                left++;
            }
        }
        return response;
    }
}
