package CodingPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] testArray = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(testArray, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] responseArray = new int[2];
        for(int i=0; i<nums.length; i++){
            int numToCheck = target - nums[i];
            if(numMap.containsKey(numToCheck)){
                responseArray[0] = numMap.get(numToCheck);
                responseArray[1] = i;
                return responseArray;
            }
            else{
                numMap.put(nums[i], i);
            }
        }
        return responseArray;
    }
}
