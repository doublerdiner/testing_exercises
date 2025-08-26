package CodingPractice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] testArray = {1,2,2,1};
        int result = removeElement(testArray, 1);
        System.out.println("result: " + result);
        System.out.println(Arrays.toString(testArray));

        testArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        result = removeElement(testArray, 2);
        System.out.println("result: " + result);
        System.out.println(Arrays.toString(testArray));
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
