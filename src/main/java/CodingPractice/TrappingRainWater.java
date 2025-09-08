package CodingPractice;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] testHeight = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(testHeight));
    }

    private static int trap(int[] height) {
        int totalWater = 0;
        int potentialPool = 0;
        int wall = height[0];
        for(int i=1; i<height.length; i++){
            if(height[i] >= wall){
                totalWater += potentialPool;
                potentialPool = 0;
                wall = height[i];
            }
            else{
                potentialPool += wall - height[i];
            }
        }
        potentialPool = 0;
        wall = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            if(height[i] > wall){
                totalWater += potentialPool;
                potentialPool = 0;
                wall = height[i];
            }
            else{
                potentialPool += wall - height[i];
            }
        }
        return totalWater;
    }
}
