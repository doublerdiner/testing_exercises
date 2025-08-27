package CodingPractice;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] testArray = {1,2};
        int answer = removeDuplicates2(testArray);
        System.out.println(answer);
    }

    private static int removeDuplicates2(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        k++;
        return k;
    }
}
