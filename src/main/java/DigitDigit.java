public class DigitDigit {
    public int squareDigits(int n){
        StringBuilder answer = new StringBuilder();
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        for(int i=0; i<digits.length; i++){
            int currentNumber = Character.getNumericValue(digits[i]);
            double squared = Math.pow(currentNumber, 2);
            answer.append(Math.round(squared));
        }
        String toBeReturned = answer.toString();
        return Integer.parseInt(toBeReturned);
    }

    public static void main(String[] args) {
        DigitDigit digit = new DigitDigit();
        System.out.println(digit.squareDigits(30152));
    }
}
