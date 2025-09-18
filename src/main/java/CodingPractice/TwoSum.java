package CodingPractice;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] testArray = {5,25,75};
        int target = 100;
        System.out.println(Arrays.toString(twoSum(testArray, target)));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = numbers.length - 1;

        int[] response = {0,0};

        while(pointer1 < pointer2){
            if(numbers[pointer1] + numbers[pointer2] == target){
                response[0] = pointer1+1;
                response[1] = pointer2+1;
                return response;
            }
            else if(numbers[pointer1] + numbers[pointer2] > target){
                pointer2--;
                continue;
            }
            pointer1++;
        }
        return response;
    }
}
