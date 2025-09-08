package CodingPractice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(productExceptSelf(testArray)));
        testArray = new int[]{1,1,1,1,1};
        System.out.println(Arrays.toString(productExceptSelf(testArray)));
        testArray = new int[]{5,6,2,3,0};
        System.out.println(Arrays.toString(productExceptSelf(testArray)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] responseArray = new int[nums.length];
        responseArray[0] = 1;
        for(int i=1; i<nums.length; i++){
            responseArray[i] = responseArray[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(int i=nums.length-1; i>=0; i--){
            responseArray[i] = responseArray[i] * suffix;
            suffix = suffix * nums[i];
        }
        return responseArray;
    }
}
