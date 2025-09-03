package CodingPractice;

public class JumpGame {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6,7};
        System.out.println(canReachEndOfArray(testArray));
        testArray = new int[]{3,0,0,0,0,1};
        System.out.println(canReachEndOfArray(testArray));
    }

    private static boolean canReachEndOfArray(int[] nums) {
        int index = nums.length-2;
        int skipInt = 1;
        while(index > -1){
            if(nums[index] >= skipInt){
                index--;
                skipInt = 1;
                continue;
            }
            skipInt++;
            index--;
        }
        return skipInt == 1;
    }
}
