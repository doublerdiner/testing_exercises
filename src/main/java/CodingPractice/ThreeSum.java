package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] testArray = {-1,0,1,2,-1,-4};
        List<List<Integer>> solution = threeSum(testArray);
        for(List<Integer> triplet : solution){
            System.out.println(triplet.toString());
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> response = new ArrayList<>();
        if(nums.length < 3){
            return response;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int total = nums[i] + nums[left] + nums[right];
                if( total == 0){
                    response.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (total > 0) {
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return response;
    }
}
