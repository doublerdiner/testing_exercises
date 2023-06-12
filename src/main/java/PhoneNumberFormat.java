public class PhoneNumberFormat {

    public String formatNumber(int[] numberArray){
        if(numberArray.length > 10 || numberArray.length < 10){
            return "Phone number must be 10 digits long";
        }
        return String.format("(%s%s%s) %s%s%s-%s%s%s%s", numberArray[0], numberArray[1], numberArray[2], numberArray[3], numberArray[4], numberArray[5], numberArray[6], numberArray[7], numberArray[8], numberArray[9]);
    }

    public static void main(String[] args) {
        PhoneNumberFormat phoneNumber = new PhoneNumberFormat();
        System.out.println("test");
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println(phoneNumber.formatNumber(test));
    }

}
