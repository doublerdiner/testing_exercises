public class HighestAndLowest {

    public String highestAndLowest(String numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] nums = numbers.split(" ");
        for(int i=0; i<nums.length; i++){
            Integer converted = Integer.parseInt(nums[i]);
            if(converted < min){
                min = converted;
            }
            if(converted > max){
                max = converted;
            }
        }
        return String.format("%s, %s", max, min);
    }

    public static void main(String[] args) {
        HighestAndLowest highestAndLowest = new HighestAndLowest();
        System.out.println(highestAndLowest.highestAndLowest("1 2 3 4 5 6"));
    }

}
