package CodingPractice;

public class MajorityElement {

    public static void main(String[] args) {
        int[] example = {1,2,2,2,3,3,2};
        System.out.println(majorityElement(example));
        int[] example2 = {0,1,2,3,4,5,0,0,0,1,2,2,1,0};
        System.out.println(majorityElement(example2));
    }
    public static int majorityElement(int[] nums) {
        int majorityNum = nums[0];
        int count = 0;
        for(int num : nums){
            count += (num == majorityNum)? 1 : -1;

            if(count == 0){
                majorityNum = num;
                count = 1;
            }
        }
        return majorityNum;
    }
}
