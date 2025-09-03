package CodingPractice;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] testArray = {2,3,1,1,4};
        System.out.println(minJumps(testArray));
    }

    private static int minJumps(int[] nums) {
        int furthest = 0;
        int currentEnd = 0;
        int jumps = 0;
        for(int i=0; i < nums.length-1; i++){
            furthest = Math.max(furthest, i+nums[i]);
            if(i == currentEnd){
                currentEnd = furthest;
                jumps++;
            }
        }
        return jumps;
    }
}
