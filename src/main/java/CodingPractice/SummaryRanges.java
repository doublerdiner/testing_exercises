package CodingPractice;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> response = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return response;
        }
        for(int i=0; i<nums.length; i++){
            int start = nums[i];
            int current = start;
            while(i != nums.length-1 && nums[i+1] == current + 1){
                i++;
                current++;
            }
            int end = nums[i];

            if(start == end){
                response.add(String.valueOf(start));
            }
            else{
                String formatted = start + "->" + end;
                response.add(formatted);
            }

        }
        return response;
    }
}
