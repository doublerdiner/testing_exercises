package CodingPractice;

import java.util.Arrays;

public class removeDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] testArray = {0,0,1,1,1,1,2,3,3};
        int answer = removeDuplicates(testArray);
        System.out.println(answer);
        System.out.println(Arrays.toString(testArray));
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int i = 2;
        for (int j = 2; j < n; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
