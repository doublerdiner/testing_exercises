package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(numMap.containsKey(nums[i])){
                int firstIndex = numMap.get(nums[i]);
                if(Math.abs(i-firstIndex) <= k){
                    return true;
                }
            }
            numMap.put(nums[i], i);
        }
        return false;
    }
}
