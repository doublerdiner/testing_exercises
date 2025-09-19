package CodingPractice;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] testArray = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(testArray));
    }
    public static int maxArea(int[] height) {
        int frontPointer = 0;
        int rearPointer = height.length-1;
        int maxVolume = 0;

        while(frontPointer < rearPointer){
            int length = rearPointer - frontPointer;
            int temp = Math.min(height[frontPointer], height[rearPointer]) * length;
            maxVolume = Math.max(temp, maxVolume);
            if(height[frontPointer] < height[rearPointer]){
                frontPointer++;
            }
            else{
                rearPointer--;
            }
        }
        return maxVolume;
    }
}
