package CodingPractice;

public class MinSizeSubArray {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};
        System.out.println(minSizeSubArray(5, testArray));
    }

    private static int minSizeSubArray(int target, int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int left = 0;
        int minSubArray = Integer.MAX_VALUE;
        int sum = 0;
        for(int right=0; right<nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                minSubArray = Math.min(minSubArray, right-left+1);
                sum -= nums[left];
                left++;
            }

        }
        return minSubArray == Integer.MAX_VALUE ? 0 : minSubArray;
    }
}
