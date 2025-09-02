package CodingPractice;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(testArray, k);
        System.out.println(Arrays.toString(testArray));
    }

    private static void rotateArray(int[] testArray, int k) {
        k = k % testArray.length;
        reverseArray(testArray, 0, testArray.length-1);
        reverseArray(testArray, 0, k-1);
        reverseArray(testArray, k, testArray.length-1);
    }

    private static void reverseArray(int[] array, int start, int end) {
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
